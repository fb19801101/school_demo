package com.controller;

import com.model.CourseInfo;
import com.model.StudentInfo;
import com.model.SystemCourseCode;
import com.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Date;
import java.util.*;

@Controller
@RequestMapping("main")
public class SystemInfoController {
	@Autowired
	private SystemClassInfoService systemClassInfoService;

	@Autowired
	private SystemCourseCodeService systemCourseCodeService;

	@Autowired
	private CourseInfoService courseInfoService;

	@Autowired
	private StudentInfoService studentInfoService;


	/**
	 * 功能：用于显示版权信息
	 *
	 * @return
	 */
	@RequestMapping("toCopyright")
	public String toCopyright() {
		return "systemInfo/copyright";
	}

	/**
	 * 功能：用于显示技术支持
	 *
	 * @return
	 */
	@RequestMapping("toTechnology")
	public String toTechnology() {
		return "systemInfo/technology";
	}

	/**
	 * 功能：添加Batch
	 *
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("addBatch")
	protected ModelAndView addBatch(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("GB2312");
		String stuId,examType;
		java.sql.Date examDate;
		stuId = request.getParameter("stuId");
		examType = request.getParameter("examType");
		examDate = java.sql.Date.valueOf(request.getParameter("examDate"));
		String findSql = "sti_id = '" + stuId +
				"' and csi_exam_type = '" + examType + "' and csi_exam_date = '" + examDate + "'";
		List findList = courseInfoService.getCourseInfoBySql(findSql);
		System.out.println("findList: " + findList);
		System.out.println("findList.isEmpty(): " + findList.isEmpty());
		if(!findList.isEmpty()){
			Map model = new HashMap();
			model.put("message", "该学生的成绩数据已经存在，请重新输入!!!");
			List list = systemCourseCodeService.getAllSystemCourseCode();
			model.put("list", list);
			return new ModelAndView("stuinfo_exam", model);
			//return new ModelAndView(new RedirectView("regCjInfo.htm"),model);
		}

		List list = systemCourseCodeService.getAllSystemCourseCode();
		Object[] obj = list.toArray();

		//DocuStuInfo stuinfo = new DocuStuInfo();
		List stuList = new ArrayList();
		stuList.add(studentInfoService.getStudentInfoById(request.getParameter("stuId")));
		System.out.println("sddds:" + stuList);
		StudentInfo stuinfo = (StudentInfo)stuList.get(0);
		List<CourseInfo> MM = stuinfo.getCourseInfos();
		//Set MM = new HashSet();
		//stuinfo.setStuId(request.getParameter("stuId"));
		for(int i = 0 ; i < obj.length ; i ++){
			SystemCourseCode courseObject = (SystemCourseCode)obj[i];
			CourseInfo regForm = new CourseInfo();
			regForm.setStudentInfo(stuinfo);
			regForm.setSystemCourseCode(courseObject);
			regForm.setCsiCzy(request.getParameter("czy"));
			regForm.setCsiExamType(request.getParameter("examType"));
			regForm.setCsiExamDate(Date.valueOf(request.getParameter("examDate")));
			regForm.setCsiGrade(request.getParameter("grade" + courseObject.getSccCode()));
			//stuinfo.getCourseStu().add(regForm);
			MM.add(regForm);
			//dao.insertOrUpdate(regForm);
		}
		//stuinfo.setCourseStu(MM);
		studentInfoService.insertStudentInfo(stuinfo);


		Map model = new HashMap();
		model.put("message", "成绩录入成功，请继续录入!!!");
		List listcode = systemCourseCodeService.getAllSystemCourseCode();
		model.put("list", listcode);
		return new ModelAndView("stuinfo_exam", model);
		/*if (submit==null||submit.length()<=0){
			if(stuId != null){
				List list1 = dao.queryObject("from DocuStuInfo where stuId='"+ stuId + "'");
				DocuStuInfo stuinfo = (DocuStuInfo)list1.get(0);
				model.put("stuName", stuinfo.getName());
			}

			model.put("list", list);
		}else{
			CourseInfo regForm = new CourseInfo();
			DocuStuInfo insertStuInfo=new DocuStuInfo();
			insertStuInfo.setStuId(request.getParameter("stuId"));
			regForm.setDocuStuInfo(insertStuInfo);
			SystemCourseCode insertCourseCode=new SystemCourseCode();
			insertCourseCode.setCode(request.getParameter("code"));
			regForm.setSystemCourseCode(insertCourseCode);
			model.put("form", regForm);
			dao.insertOrUpdate(regForm);
			model.put("message", "成绩录入成功，请继续录入。");
		}	*/
	}

	/**
	 *
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("linkSourceList")
	public ModelAndView linkSourceList(HttpServletRequest request, HttpServletResponse response) {
		List listClass = systemClassInfoService.getAllSystemClassInfo();
		System.out.println("class:" + listClass);
		return new ModelAndView("sourceview/stuinfo_list", "classlist",listClass);
	}
}