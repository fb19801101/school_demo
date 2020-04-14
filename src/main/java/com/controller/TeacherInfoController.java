package com.controller;

import com.model.*;
import com.service.SystemSpecialtyCodeService;
import com.service.TeacherInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.WebUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("teacher")
public class TeacherInfoController {
	@Autowired
	private SystemSpecialtyCodeService systemSpecialtyCodeService;

	@Autowired
	private TeacherInfoService teacherInfoService;


	/**
	 * 功能：用于显示教师信息
	 * 实现：通过request请求参数中的skzy值来进行
	 *      判断是哪个条件显示教师信息
	 *
	 * @param request
	 * @param response
	 */
	@RequestMapping("regTeacherInfo")
	protected ModelAndView regTeacherInfo(TeacherInfo teacherInfo, HttpServletRequest request, HttpServletResponse response) {
		System.out.println("run");
		String sscCode = request.getParameter("sscCode");

		if(sscCode != null) {
			Map map = WebUtils.getParametersStartingWith(request, "tei");
			String _TeiId = request.getParameter("teiId");
			String _SscCode = request.getParameter("SscCode");
			String _TeiName = request.getParameter("TeiName");
			String _TeiSex = request.getParameter("TeiSex");

			TeacherInfo teaInfo = new TeacherInfo();
			teaInfo.setTeiId(_TeiId);
			teaInfo.setTeiId(_SscCode);
			teaInfo.setTeiId(_TeiName);
			teaInfo.setTeiId(_TeiSex);
			SystemSpecialtyCode code = new SystemSpecialtyCode(sscCode);
			System.out.println("gzjj" + teaInfo.getTeiGzjj());

			if (teaInfo.getTeiGzjj().equals("")) {
				teaInfo.setTeiGzjj(null);
				System.out.println("null");
			}

			teaInfo.setSystemSpecialtyCode(code);
			List list = teacherInfoService.queryTeacherInfoByCondition("tei_sfzh", teaInfo.getTeiSfzh());
			boolean haveTea = list.size() > 0 ? (list.get(0) == null ? false : true) : false;
			if (haveTea && teaInfo.getTeiId() == null) {// 如果form中不包含teaId说明是录入请求
				list = systemSpecialtyCodeService.getAllSystemSpecialtyCode();
				Map model = new HashMap();
				model.put("ssclist", list);
				model.put("alert", "身份证“" + teaInfo.getTeiSfzh() + "已经存在");
				return new ModelAndView("memberview/teainfo_register", model);
			} else if (haveTea && teaInfo.getTeiId() != null) {// 如果form中包含teaId说明是修改请求
				teacherInfoService.insertTeacherInfo(teaInfo);
				list = teacherInfoService.getAllTeacherInfo();
				Map model = new HashMap();
				model.put("tealist", list);
				return new ModelAndView("memberview/teainfo_service", model);
			}

			String ssccode = teaInfo.getSystemSpecialtyCode().getSscCode();
			list = teacherInfoService.getTeacherInfoFieldsByCondition("max(tei_id)", "ssc_code", ssccode);
			String maxId = null;
			if (list.get(0) != null) {
				maxId = String.format("TEI%03d",list.get(0));
			}

			if (maxId != null) {
				int id = Integer.parseInt(maxId.substring(2, maxId.length() - 3)) + 1;
				maxId = String.format("TEI%03d",id);
			} else {
				maxId = "TEI001";
			}

			teaInfo.setTeiId(maxId);
			teacherInfoService.insertTeacherInfo(teaInfo);
			list = systemSpecialtyCodeService.getAllSystemSpecialtyCode();
			Map model = new HashMap();
			model.put("ssclist", list);
			model.put("teainfo", teaInfo);
			return new ModelAndView("memberview/teainfo_register", model);
		}

		List list = systemSpecialtyCodeService.getAllSystemSpecialtyCode();
		Map model = new HashMap();
		model.put("ssclist", list);
		return new ModelAndView("memberview/teainfo_register", model);
	}

	/**
	 * 功能：用于显示教师信息设置控制器
	 * 实现：通过request请求参数中的teaId值来进行
	 *      设置查询教师的ID
	 *
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("serviceTeacherInfo")
	public ModelAndView serviceTeacherInfo(HttpServletRequest request, HttpServletResponse response) {
		String teiId = request.getParameter("teiId");
		System.out.println("teiId:" + teiId);
		if (teiId == null) {
			List list = teacherInfoService.getAllTeacherInfo();
			Map model = new HashMap();
			model.put("tealist", list);
			return new ModelAndView("memberview/teainfo_service", model);
		} else {
			TeacherInfo teaInfo = teacherInfoService.getTeacherInfoById(teiId);
			List list = systemSpecialtyCodeService.getAllSystemSpecialtyCode();
			Map model = new HashMap();
			model.put("teainfo", teaInfo);
			model.put("ssclist", list);
			return new ModelAndView("memberview/teainfo_modify", model);
		}
	}

	/**
	 * 功能：用于更新学生信息
	 * 实现：通过request请求参数中的stuid值来进行
	 *      判断学生ID是否存在
	 *
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("modifyTeacherInfo")
	public ModelAndView modifyTeacherInfo(HttpServletRequest request, HttpServletResponse response) {
		String teiId = request.getParameter("teiId");

		TeacherInfo teaInfo = teacherInfoService.getTeacherInfoById(teiId);
		if(teaInfo != null) {
			List<AssignCourse> assignCourses = teaInfo.getAssignCourses();
			if (assignCourses != null) {
				Iterator iter = assignCourses.iterator();
				while (iter.hasNext()) {
					AssignCourse ace = (AssignCourse) iter.next();
					if(ace != null) {
						System.out.println("Lzrq:" + ace.getAceLzrq());
						System.out.println("Rzrq:" + ace.getAceRzrq());
					}

				}
			}
		}
		return new ModelAndView("memberview/teainfo_modify", "messages", teaInfo);
	}

	/**
	 * 功能：用于查询教师信息
	 * 实现：通过request请求参数中的condition和conditionContent值来进行
	 *      设置查询条件
	 *
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("searchTeacherInfo")
	public ModelAndView searchTeacherInfo(HttpServletRequest request, HttpServletResponse response) {
		String condition = request.getParameter("condition");
		String conditionContent = request.getParameter("conditionContent");
		if (condition.equals("姓名")) {
			condition = "tei_name";
		} else if (condition.equals("身份证֤")) {
			condition = "tei_sfzh";
		} else {
			condition = "tei_id";
		}
		List list = teacherInfoService.queryTeacherInfoByCondition(condition,conditionContent);
		Map model = new HashMap();
		model.put("tealist", list);
		return new ModelAndView("memberview/teainfo_service", model);
	}
}
