package com.controller;

import com.model.*;
import com.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("main")
public class AssignController {
	@Autowired
	private SystemCourseCodeService systemCourseCodeService;

	@Autowired
	private TeacherInfoService teacherInfoService;

	@Autowired
	private AssignCourseService assignCourseService;

	@Autowired
	private SystemClassInfoService systemClassInfoService;

	@Autowired
	private AssignClassService assignClassService;


	/**
	 * 功能：用于分配教师授课课程
	 * 实现：通过request请求参数中的stuid值来进行
	 *      判断学生ID是否存在
	 *
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("assignCourseLoader")
	public ModelAndView assignCourseLoader(HttpServletRequest request, HttpServletResponse response) {// 任教
		String teiId = request.getParameter("teiId");
		String submit = request.getParameter("Submit");
		List list =systemCourseCodeService.getAllSystemCourseCode();
		Map model = new HashMap();
		model.put("list", list);
		if (teiId != null) {
			TeacherInfo tei = teacherInfoService.getTeacherInfoById(teiId);
			if (tei != null) {
				model.put("teaInfo", tei);
			}
		}
		if (submit != null) {
			String sccCode = request.getParameter("sccCode");
			TeacherInfo teaInfo = new TeacherInfo(teiId, new SystemSpecialtyCode());
			SystemCourseCode courseInfo = new SystemCourseCode(sccCode);
			AssignCourse assignCourse = new AssignCourse(teaInfo, courseInfo);
			System.out.println(Date.valueOf("2020-8-8"));
			assignCourse.setAceRzrq(Date.valueOf(request.getParameter("aceRzrq").trim()));
			assignCourseService.insertAssignCourse(assignCourse);
			model.remove("teaInfo");
			model.put("message", "任职成功");
		}
		return new ModelAndView("assignview/teaInstateCourses", model);
	}

	/**
	 * 功能：用于分配教师授课班级
	 * 实现：通过request请求参数中的stuid值来进行
	 *      判断学生ID是否存在
	 *
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("assignClassLoader")
	public ModelAndView assignClassLoader(HttpServletRequest request, HttpServletResponse response) {// 任班主任
		String changesciId = request.getParameter("changesciId");
		String changeteiId = request.getParameter("changeteiId");
		String submit = request.getParameter("Submit");
		List list = systemClassInfoService.getAllSystemClassInfo();
		Map model = new HashMap();
		model.put("classInfo", list);
		model.put("rowInfo", list.size()>0?list.get(0):null);
		if (submit == null) {
			if (changesciId != null) {
				SystemClassInfo sci = systemClassInfoService.getSystemClassInfoById(changesciId);
				if (sci != null) {
					model.put("rowInfo", sci);
				}
			}
			if (changeteiId != null) {
				TeacherInfo tei = teacherInfoService.getTeacherInfoById(changeteiId);
				if (tei != null) {
					model.put("teaInfo", tei);
				}
			}
		} else {
			String teiId = request.getParameter("teiId");
			String sciId = request.getParameter("sciId");
			TeacherInfo teaInfo = new TeacherInfo(teiId, new SystemSpecialtyCode());
			SystemClassInfo classInfo = new SystemClassInfo(sciId);
			Date date = Date.valueOf(request.getParameter("acsRzrq"));
			AssignClass assignClass = new AssignClass(teaInfo, classInfo);
			assignClass.setAcsRzrq(date);
			assignClassService.insertAssignClass(assignClass);
			model.put("message", "任职班主任成功");
		}
		return new ModelAndView("assignview/teaInstateClass", model);
	}

	/**
	 * 功能：用于查询教师授课班级
	 * 实现：通过request请求参数中的stuid值来进行
	 *      判断学生ID是否存在
	 *
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("searchClassLoader")
	public ModelAndView searchClassLoader(HttpServletRequest request, HttpServletResponse response) {// 查询班主任
		List list = null;
		String history=request.getParameter("history");
		String nop = history==null?"=":"<>";
		String acsId = request.getParameter("acsId");
		if (acsId != null) {//教师离职
			AssignClass acs = assignClassService.getAssignClassById(acsId);
			if (acs != null) {
				acs.setAcsLzrq(new Date(System.currentTimeMillis()));
				assignClassService.insertAssignClass(acs);
			}
		}
		String condition = request.getParameter("condition");
		String conditionContent = request.getParameter("conditionContent");
		if (condition == null) {
			condition = "acs_id";
		}
		if (conditionContent == null) {
			conditionContent = "";
		}
		String sql = condition+" like "+conditionContent+"'%'"+" and acs_lzrq "+nop+" null";
		list = assignClassService.getAssignClassBySql(sql);
		Map model = new HashMap();
		model.put("list", list);
		model.put("condition", condition);
		model.put("conditionContent", conditionContent);
		model.put("history", history);
		return new ModelAndView("assignview/teaClassSearch", model);
	}

	/**
	 * 功能：用于查询教师授课课程
	 * 实现：通过request请求参数中的stuid值来进行
	 *      判断学生ID是否存在
	 *
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("searchCourseLoader")
	public ModelAndView searchCourseLoader(HttpServletRequest request, HttpServletResponse response) {// 查询任课教师
		List list = null;
		String history=request.getParameter("history");
		String nop=history==null?"=":"<>";
		String aceId = request.getParameter("aceId");
		System.out.println(333);
		if (aceId != null) {//教师离职
			String sql = String.format("ace_id=%s and ace_lzrq=null",aceId);
			list = assignCourseService.getAssignCourseBySql(sql);
			if (list.size() > 0) {
				AssignCourse ace = (AssignCourse) list.get(0);
				ace.setAceLzrq(new Date(System.currentTimeMillis()));
				assignCourseService.insertAssignCourse(ace);
			}
		}
		String condition = request.getParameter("condition");
		String conditionContent = request.getParameter("conditionContent");
		if (condition == null) {
			condition = "scc_code";
		}
		if (conditionContent == null) {
			conditionContent = "";
		}
		String sql = condition+" like "+conditionContent+"'%'"+" and ace_lzrq "+nop+" null";
		list = assignCourseService.getAssignCourseBySql(sql);
		System.out.println(list.size());

		Map model = new HashMap();
		model.put("list", list);
		model.put("condition", condition);
		model.put("conditionContent", conditionContent);
		model.put("history", history);
		return new ModelAndView("assignview/teaCourseSearch", model);
	}
}