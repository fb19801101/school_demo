package com.controller;

import com.model.CourseInfo;
import com.model.StudentInfo;
import com.model.SystemClassInfo;
import com.model.SystemCourseCode;
import com.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.util.*;

/**
 * @author 信息化管理部-方波
 * @site http://www.cr121.com/
 * @company 中铁十二局集团第一工程有限公司
 * @create 2020-03-12 23:47
 */
@Controller
@RequestMapping("main")
public class ExamInfoController {
    @Autowired
    private SystemCourseCodeService systemCourseCodeService;

    @Autowired
    private StudentInfoService studentInfoService;

    @Autowired
    private SystemClassInfoService systemClassInfoService;

    @Autowired
    private CourseInfoService courseInfoService;

    @Autowired
    private SystemGradeCodeService systemGradeCodeService;

    /**
     * 功能：用于录入考试信息
     * 实现：通过request请求参数中的stuid值来进行
     *      判断学生ID是否存在
     *
     * @param request
     * @param response
     * @return
     */
    @RequestMapping("regExamInfo")
    public ModelAndView regExamInfo(HttpServletRequest request, HttpServletResponse response) {
        List list = systemCourseCodeService.getAllSystemCourseCode();
        Map model = new HashMap();
        model.put("list", list);
        String stiId = request.getParameter("stiId");
        if (stiId != null) {
            StudentInfo stuInfo = studentInfoService.getStudentInfoById(stiId);
            if (stuInfo != null) {
                model.put("stuInfo", stuInfo);
            }
        }

        return new ModelAndView("sourceview/stuinfo_exam", model);
    }

    /**
     * 功能：用于查询考试信息
     * 实现：通过request请求参数中的stuid值来进行
     *      判断学生ID是否存在
     *
     * @param request
     * @param response
     * @return
     */
    @RequestMapping("searchExamInfo")
    public ModelAndView searchExamInfo(HttpServletRequest request, HttpServletResponse response) {
        String condition = request.getParameter("condition");
        String conditionContent = request.getParameter("conditionContent");
        List list = null;
        System.out.println(condition);
        if (condition != null && conditionContent != null) {
            System.out.println("ccc"+condition);
            if (condition.equals("考试类别")) {
                condition = "csi_exam_type";
            } else if (condition.equals("科目名称")) {
                condition = "scc_code";
                SystemCourseCode systemCourseCode = systemCourseCodeService.getSystemCourseCodeByName(conditionContent);
                if(systemCourseCode != null) {
                    conditionContent = systemCourseCode.getSccCode();
                }
            } else if (condition.equals("学生姓名")) {
                condition = "sti_id";
                StudentInfo studentInfo = studentInfoService.getStudentInfoByName(conditionContent);
                if(studentInfo != null) {
                    conditionContent = studentInfo.getStiId();
                }
            } else if (condition.equals("学生编号")) {
                condition = "sti_id";
            } else {
                condition = "sti_id";
                StudentInfo studentInfo = studentInfoService.getStudentInfoByName(conditionContent);
                if(studentInfo != null) {
                    conditionContent = studentInfo.getStiId();
                }
        }
            list = courseInfoService.queryCourseInfoByCondition(condition,conditionContent);
        } else {
            list = courseInfoService.getAllCourseInfo();
        }
        Map model = new HashMap();
        model.put("list", list);
        return new ModelAndView("sourceview/stuinfo_search", model);
    }

    /**
     * 功能：用于班级考试成绩查询
     * 实现：通过request请求参数中的stuid值来进行
     *      判断学生ID是否存在
     *
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @RequestMapping("classScoreList")
    public ModelAndView classScoreList(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String sciId = request.getParameter("selectClass");
        String examType = request.getParameter("examType");
        String examDate = request.getParameter("examDate");

        List listClassInfo = systemClassInfoService.getAllSystemClassInfo();
        List listCourseCode = systemCourseCodeService.getAllSystemCourseCode();

        java.util.Vector vname = new java.util.Vector();
        vname.addElement("学生姓名");
        vname.addElement("考试类别");
        vname.addElement("考试日期");
        Iterator iterator = listCourseCode.iterator();
        int index = 0;
        while (iterator.hasNext()) {
            SystemCourseCode systemCourseCode = (SystemCourseCode) iterator.next();
            if(systemCourseCode != null) {
                vname.addElement(systemCourseCode.getSccName());
            }
            index++;
        }
        vname.addElement("总分数");
        String sqlSelect = null;
        if(sciId != null && examType != null) {
            sqlSelect = "csi_id LIKE '"
                    + sciId
                    + "' AND csi_exam_type LIKE '"
                    + examType + "')";

            if (examDate != null) {
                sqlSelect = "csi_id LIKE '"
                        + sciId
                        + "' AND csi_exam_type LIKE '"
                        + examType
                        + "' AND csi_exam_date = '" + examDate + "')";
            }
        }
        List courseListObject = courseInfoService.getCourseInfoBySql(sqlSelect);
        System.out.println(courseListObject);
        Object[] courseArray = courseListObject.toArray();
        int count = courseArray.length;
        java.util.Collection collection = new java.util.ArrayList();
        int modcount = (index != 0) ? count / index:0;

        for (int i = 0; i < modcount; i++) {
            Vector vdata = new Vector();
            CourseInfo courseInfo = (CourseInfo) courseArray[i * index];
            if(courseInfo != null) {
                if(courseInfo.getStudentInfo() != null) {
                    vdata.addElement(courseInfo.getStudentInfo().getStiName());
                }
                vdata.addElement(courseInfo.getCsiExamType());
                vdata.addElement(courseInfo.getCsiExamDate());
            }

            float gradesum = 0.0f;
            for (int j = 0; j < index; j++) {
                CourseInfo course = (CourseInfo) courseArray[i * index + j];
                if(course != null) {
                    vdata.addElement(course.getCsiGrade());
                    gradesum = gradesum + Float.parseFloat(String.valueOf(course.getCsiGrade()));
                }
            }
            vdata.addElement(Float.valueOf(gradesum));
            gradesum = 0.0f;
            collection.add(vdata);
        }

        sciId = request.getParameter("selectClass");
        Map map = new HashMap();
        map.put("class", listClassInfo);
        map.put("tname", vname);
        map.put("cdata", collection);
        map.put("oldid", sciId);
        return new ModelAndView("sourceview/stuinfo_class", "map", map);
    }

    /**
     * 功能：用于年级考试成绩统计
     * 实现：通过request请求参数中的stuid值来进行
     *      判断学生ID是否存在
     *
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @RequestMapping("gradeScoreList")
    public ModelAndView gradeScoreList(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String sgcCode = request.getParameter("selectGrade");
        String examType = request.getParameter("examType");
        String examDate = request.getParameter("examDate");
        List listGrade = systemGradeCodeService.getAllSystemGradeCode();
        List listCourse = systemCourseCodeService.getAllSystemCourseCode();
        Map map = new HashMap();
        map.put("grade", listGrade);

        java.util.Vector vname = new java.util.Vector();
        vname.addElement("班级名称");
        vname.addElement("学生人数");
        vname.addElement("考试类别");
        vname.addElement("考试日期");
        map.put("tname", vname);
        if (examType == null) {
            map.put("message", "请输入查询条件");
            return new ModelAndView("sourceview/stuinfo_grade",
                    "map", map);
        }
        Iterator iterator = listCourse.iterator();
        int index = 0;
        while (iterator.hasNext()) {
            SystemCourseCode scc = (SystemCourseCode) iterator.next();
            if(scc != null) {
                vname.addElement(scc.getSccName());
            }
            index++;
        }
        vname.addElement("总分数");
        String sqlSelect = null;
        if (examType == null) {
            sqlSelect = "select csi_code, scc_code as 班级代码,str(sum(csi_grade)/count(sti_id),6,2) as 班级成绩,count(sti_id) as 班级人数 from course_stu_info group by csi_code,scc_code ";
        } else {
            if(examDate != null) {
                System.out.println("no null");
                sqlSelect = "select csi_code, scc_code as 班级代码,str(sum(csi_grade)/count(sti_id),6,2) as 班级成绩,count(sti_id) as 班级人数 from course_stu_info where left(sti_id,2)='" + sgcCode + "' and csi_exam_type = '"
                        + examType
                        + "' and csi_exam_date = '"
                        + examDate
                        + "' group by csi_code,scc_code";
            }
        }

        List courseListObject = courseInfoService.getCourseInfoBySql(sqlSelect);

        /*
         * Iterator it = courseListObject.iterator(); while(it.hasNext()){
         * Object[] results = (Object[])it.next();
         *
         * System.out.println(results); for(int i = 0 ; i < results.length ;
         * i++){ System.out.println("结果输出: " + results[i]); } }
         */
        Object[] courseArray = courseListObject.toArray();
        int count = courseArray.length;
        java.util.Collection collection = new java.util.ArrayList();
        int modcount = count / index;
        for (int i = 0; i < modcount; i++) {
            Vector vdata = new Vector();
            Object[] results = (Object[]) courseArray[i * index];
            String classid = String.valueOf(results[1]);
            SystemClassInfo sci = systemClassInfoService.getSystemClassInfoById(classid);
            if(sci != null) {
                vdata.addElement(sci.getSciName());
            }
            vdata.addElement(results[3]);
            vdata.addElement(examType);
            vdata.addElement(examDate);

            float gradesum = 0.00f;
            for (int j = 0; j < index; j++) {
                Object[] course = (Object[]) courseArray[i * index + j];
                vdata.addElement(course[2]);
                gradesum = gradesum + Float.parseFloat(String.valueOf(course[2])); // 总分数
            }
            java.text.DecimalFormat formatsum = new java.text.DecimalFormat("#.00");
            vdata.addElement(formatsum.format(gradesum));
            gradesum = 0.0f;
            collection.add(vdata);
        }
        sgcCode = request.getParameter("selectGrade");
        if (examDate == null || examType == null) {
            map.put("cdata", null);
        } else {
            map.put("cdata", collection);
        }
        map.put("oldsgcId", sgcCode);
        map.put("examType", examType);
        map.put("examDate", examDate);
        return new ModelAndView("sourceview/stuinfo_grade", "map", map);
    }
}
