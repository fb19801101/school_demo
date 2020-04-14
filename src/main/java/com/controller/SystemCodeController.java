package com.controller;

import com.model.*;
import com.service.SystemClassInfoService;
import com.service.SystemCourseCodeService;
import com.service.SystemGradeCodeService;
import com.service.SystemSpecialtyCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("main")
public class SystemCodeController {
	@Autowired
	private SystemSpecialtyCodeService systemSpecialtyCodeService;

	@Autowired
	private SystemGradeCodeService systemGradeCodeService;

	@Autowired
	private SystemClassInfoService systemClassInfoService;

	@Autowired
	private SystemCourseCodeService systemCourseCodeService;

	private String viewName = null; //标识视图名字

	private List getClassInfo() {
		List classinfo = systemClassInfoService.getAllSystemClassInfo();
		List classlist = new ArrayList();

		for(int i=0;i<classinfo.size();i++){
			SystemClassInfoList scil = new SystemClassInfoList();
			SystemClassInfo sci = (SystemClassInfo)classinfo.get(i);
			scil.setSciId(sci.getSciId());
			scil.setSciName(sci.getSciName());
			if(sci.getSystemGradeCode() != null) {
				scil.setSgcName(sci.getSystemGradeCode().getSgcName());
			}
			if(sci.getSystemSpecialtyCode() != null) {
				scil.setSscName(sci.getSystemSpecialtyCode().getSscName());
			}
			classlist.add(scil);
		}
		return classlist;
	}


	/**
	 * 功能：用于显示代码表中的全部数据
	 * 实现：通过request请求参数中的name值来进行
	 *      判断是哪个代码表
	 *
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("lCode")
	public ModelAndView CodeList(HttpServletRequest request,HttpServletResponse response) {
		String name = request.getParameter("name");
		System.out.println("name:" + name);
		List listObject = null;
		Map mapMessages = new HashMap();
		if (name.equals("ssc")){
			listObject = systemSpecialtyCodeService.getAllSystemSpecialtyCode();
			viewName = "syscodeview/sys_code_specialty";
		}else if(name.equals("sgc")){
			listObject = systemGradeCodeService.getAllSystemGradeCode();
			viewName = "syscodeview/sys_code_grade";
		}else if(name.equals("sci")){
			//获得班级对应的控制器文件
			Map maps = new HashMap();
			List gradeList = systemGradeCodeService.getAllSystemGradeCode();
			List specList = systemSpecialtyCodeService.getAllSystemSpecialtyCode();
			maps.put("grade",gradeList);
			maps.put("spec",specList);
			maps.put("classinfo",getClassInfo());
			viewName = "syscodeview/sys_code_class";
			return new ModelAndView(this.viewName,"messages",maps);

		}else if(name.equals("scc")){
			listObject = systemCourseCodeService.getAllSystemCourseCode();
			viewName = "syscodeview/sys_code_course";
		}
		mapMessages.put("listObject", listObject);
		return new ModelAndView(this.viewName,mapMessages);
	}

	/**
	 * 功能：用于显示代码表中的全部数据
	 * 实现：通过request请求参数中的name值来进行
	 *      判断是哪个代码表
	 *
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("queryCode")
	public ModelAndView CodeQuery(HttpServletRequest request,HttpServletResponse response) {
		String name = request.getParameter("name");
		String id = request.getParameter("code");
		System.out.println("name:" + name + "id:" + id);
		List listObject = null;

		if (name.equals("ssc")){
			SystemSpecialtyCode ssc = systemSpecialtyCodeService.getSystemSpecialtyCodeByCode(id);
			if(ssc != null) {
				listObject.add(ssc.toSystemCode());
			}

			viewName = "syscodeview/sys_code_specialty";
		}else if(name.equals("sgc")){
			SystemGradeCode sgc = systemGradeCodeService.getSystemGradeCodeByCode(id);
			if(sgc != null) {
				listObject.add(sgc.toSystemCode());
			}

			viewName = "syscodeview/sys_code_grade";
		}else if(name.equals("sci")){
			SystemClassInfo sci = systemClassInfoService.getSystemClassInfoById(id);
			if(sci != null) {
				listObject.add(sci.toSystemCode());
			}

			viewName = "syscodeview/sys_code_class";
		}else if(name.equals("scc")){
			SystemCourseCode scc = systemCourseCodeService.getSystemCourseCodeByCode(id);
			if(scc != null) {
				listObject.add(scc.toSystemCode());
			}

			viewName = "syscodeview/sys_code_course";
		}
		return new ModelAndView(this.viewName,"objInf",listObject);
	}

	/**
	 * 功能：用于显示代码表中的全部数据
	 * 实现：通过request请求参数中的name值来进行
	 *      判断是哪个代码表
	 *
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("delCode")
	public ModelAndView delCode(HttpServletRequest request,HttpServletResponse response) {
		String name = request.getParameter("name");
		String code = request.getParameter("code");
		System.out.println("name:" + name + ";igggd:" + code);
		List listObject = null;
		Map mapMessages = new HashMap();
		boolean flag = false ;

		if (name.equals("ssc")){
			SystemSpecialtyCode object = systemSpecialtyCodeService.getSystemSpecialtyCodeByCode(code);
			//flag = dao.deleteObject(object);
			flag = (systemSpecialtyCodeService.delSystemSpecialtyCodeByCode(code) == -1) ? false:true ;
			listObject = systemSpecialtyCodeService.getAllSystemSpecialtyCode();
			viewName = "syscodeview/sys_code_specialty";
		}else if(name.equals("sgc")){
			SystemGradeCode object = systemGradeCodeService.getSystemGradeCodeByCode(code);
			flag = (systemGradeCodeService.delSystemGradeCodeByCode(code) == -1)?false:true;
			listObject = systemGradeCodeService.getAllSystemGradeCode();
			mapMessages.put("listObject", listObject);
			viewName = "syscodeview/sys_code_grade";
		}else if(name.equals("sci")){
			SystemClassInfo object = systemClassInfoService.getSystemClassInfoById(code);
			System.out.println("object:" + object);
			flag = (systemClassInfoService.delSystemClassInfoById(code) == -1)?false:true;
			List gradeList = systemGradeCodeService.getAllSystemGradeCode();
			List specList = systemSpecialtyCodeService.getAllSystemSpecialtyCode();

			listObject = getClassInfo(); //获得班级对象信息
			viewName = "syscodeview/sys_code_class";
			Map mapMessage = new HashMap();
			mapMessage.put("classinfo",listObject);
			mapMessage.put("grade",gradeList);
			mapMessage.put("spec",specList);
			if (flag){
				mapMessage.put("msgError", "");
			}else{
				mapMessage.put("msgError", "系统提示:数据已经使用不能删除");
			}
			return new ModelAndView(viewName,"messages",mapMessage);
		}else if(name.equals("scc")){
			SystemCourseCode object = systemCourseCodeService.getSystemCourseCodeByCode(code);
			flag = (systemCourseCodeService.delSystemCourseCodeByCode(code) == -1)?false:true;
			listObject = systemCourseCodeService.getAllSystemCourseCode();
			viewName = "syscodeview/sys_code_course";
		}
		mapMessages.put("listObject", listObject);
		if (flag){
			mapMessages.put("msgError", "");
		}else{
			mapMessages.put("msgError", "系统提示:数据已经使用不能删除");
		}
		return new ModelAndView(this.viewName,mapMessages);
	}

	/**
	 *
	 * @param request
	 * @param reponse
	 * @param obj
	 * @return
	 */
	@RequestMapping("sysFormCode")
	protected ModelAndView sysFormCode(Object obj, HttpServletRequest request, HttpServletResponse reponse) {
		String objName = request.getParameter("objname");
		String viewPage = null;
		System.out.println("objName= " + objName);
		List objList = null;
		if (objName.equals("SystemSpecialtyCode")){
			SystemSpecialtyCode ssc = (SystemSpecialtyCode) obj;
			viewPage = "sys_code_specialty";
			systemSpecialtyCodeService.insertSystemSpecialtyCode(ssc);
			objList = systemSpecialtyCodeService.getAllSystemSpecialtyCode();
		}else if(objName.equals("SystemGradeCode")){
			SystemGradeCode sgc = (SystemGradeCode) obj;
			viewPage = "sys_code_grade";
			systemGradeCodeService.insertSystemGradeCode(sgc);
			objList = systemGradeCodeService.getAllSystemGradeCode();
		}else if(objName.equals("SystemCourseCode")){
			SystemCourseCode scc = (SystemCourseCode)obj;
			viewPage = "sys_code_course";
			systemCourseCodeService.insertSystemCourseCode(scc);
			objList = systemCourseCodeService.getAllSystemCourseCode();
		}

		return new ModelAndView("syscodeview/" + viewPage, "listObject", objList);
	}
}