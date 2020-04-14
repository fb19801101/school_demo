package com.controller;

import com.model.*;
import com.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import javax.print.DocFlavor;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.DateFormatter;
import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

@Controller
@RequestMapping("main")
public class StudentInfoController {
	@Autowired
	private SystemClassInfoService systemClassInfoService;

	@Autowired
	private StudentInfoService studentInfoService;

	@Autowired
	private StudentRegisterService studentRegisterService;

	@Autowired
	private SystemCourseCodeService systemCourseCodeService;

	@Autowired
	private SystemSpecialtyCodeService systemSpecialtyCodeService;

	@Autowired
	private CourseInfoService courseInfoService;

	@InitBinder
	public void intDate(WebDataBinder dataBinder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dataBinder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
	}


	/**
	 * 功能：用于插入学生信息
	 * 实现：通过request请求参数中的ctname值来进行
	 *      判断学生名称是否存在
	 *
	 * @param studentInfo
	 * @param request
	 * @param reponse
	 * @return
	 */
	@RequestMapping("insertStudentInfo")
	protected ModelAndView insertStudentInfo(String sciId, StudentInfo studentInfo, HttpServletRequest request, HttpServletResponse reponse) {
		HashMap mapMsg = new HashMap();
		List list = systemClassInfoService.getAllSystemClassInfo();
		mapMsg.put("class", list);

		String stiName = request.getParameter("stiName");
		if(studentInfo.getStiId() != null) {
			StudentInfo stuInfo = studentInfoService.getStudentInfoById(studentInfo.getStiId());
			if(stuInfo != null) {
				stiName = stuInfo.getStiName();
			}
		}

		if(stiName != null) {
			mapMsg.put("stiName", stiName);

			list = studentInfoService.getStudentInfoByCondition("sti_name", stiName);

			if (list.size() == 0) {
				studentInfoService.insertStudentInfo(studentInfo);

				mapMsg.put("stiId", studentInfo.getStiId());
				mapMsg.put("msg", "学生基本信息数据录入成功!");
				return new ModelAndView("memberview/stuinfo_insert","messages",mapMsg);
			} else {
				studentInfo = (StudentInfo)list.get(0);
				String stiId = studentInfo.getStiId();
				mapMsg.put("stiId", stiId);

				list = studentRegisterService.getStudentRegisterByCondition("sti_id",stiId);

				if (list.size() > 0) {
					StudentRegister studentRegister = (StudentRegister)list.get(0);
					sciId = studentRegister.getSciId();

					String strDjrq = DateConverter.format(studentRegister.getStrDjrq());
					mapMsg.put("strDjrq", strDjrq);
					mapMsg.put("msg", "该学生已经登记,请重新选择!");
				} else {
					String strDjrq = DateConverter.format(new Date(System.currentTimeMillis()));
					mapMsg.put("strDjrq", strDjrq);
					mapMsg.put("msg", "学生基本信息数据已经录入，尚未进行登记信息！");
				}

				mapMsg.put("sciId", sciId);
				SystemClassInfo systemClassInfo = systemClassInfoService.getSystemClassInfoById(sciId);
				if(systemClassInfo != null) {
					String SciName = systemClassInfo.getSciName();
					mapMsg.put("sciName", SciName);
					String sscCode = systemClassInfo.getSscCode();
					SystemSpecialtyCode ssc = systemSpecialtyCodeService.getSystemSpecialtyCodeByCode(sscCode);
					if (ssc != null) {
						mapMsg.put("strZymc", ssc.getSscName());
					}
				} else {
					return new ModelAndView("memberview/stuinfo_insert","messages",mapMsg);
				}

				return new ModelAndView("memberview/stuinfo_register","messages",mapMsg);
			}
		}

		mapMsg.put("msg", "学生姓名不能为空，请重新输入!");
		return new ModelAndView("memberview/stuinfo_insert","messages",mapMsg);
	}

	/**
	 * 功能：用于查询班级学生信息
	 *
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("searchClassStudentInfo")
	public ModelAndView searchClassStudentInfo(HttpServletRequest request, HttpServletResponse response) {
		List listClass = systemClassInfoService.getAllSystemClassInfo();
		System.out.println("class:" + listClass);

		List courseList = systemCourseCodeService.getAllSystemCourseCode();
		java.util.Vector vname = new java.util.Vector();
		vname.addElement("学生姓名");
		Iterator iterator = courseList.iterator();
		int index = 0;
		while(iterator.hasNext()){
			SystemCourseCode courseObject = (SystemCourseCode)iterator.next();
			vname.addElement(courseObject.getSccName());
			index ++;
		}
		List courseListObject = courseInfoService.getAllCourseInfo();
		System.out.println("courseListObject:" + courseListObject);
		Object[] courseArray = courseListObject.toArray();
		int count = courseArray.length;
		java.util.Collection collection = new java.util.ArrayList();
		int modcount = (index != 0) ? count / index : 0;
		for(int i = 0 ; i < modcount; i++){
			Vector vdata = new Vector();
			CourseInfo coursename = (CourseInfo)courseArray[i * index];
			vdata.addElement(coursename.getStudentInfo().getStiName());
			for(int j = 0 ; j < index ; j++){
				CourseInfo course = (CourseInfo)courseArray[i * index + j];
				vdata.addElement(course.getCsiGrade());
			}
			collection.add(vdata);
		}
		Map map = new HashMap();
		map.put("clname", listClass);
		map.put("tname", vname);
		map.put("cdata", collection);
		return new ModelAndView("sourceview/stuinfo_list", "map",map);
	}

	/**
	 * 功能：用于注册学生信息
	 * 实现：通过request请求参数中的stuid值来进行
	 *      判断学生ID是否存在
	 *
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("regStudentInfo")
	public ModelAndView regStudentInfo(StudentRegister studentRegister, HttpServletRequest request, HttpServletResponse response) {
		String stiId = request.getParameter("stiId");
		Map mapMsg = new HashMap();

		if (stiId == null) {
			return new ModelAndView("memberview/stuinfo_register", "sysMsgInf",
					"<script language='javascript'>alert('学生编号不存在,请重新输入!')</script>");
		} else {
			StudentInfo stuInfo = studentInfoService.getStudentInfoById(stiId);
			if(stuInfo != null) {
				studentRegister.setStudentInfo(stuInfo);
				mapMsg.put("stiId", stuInfo.getStiId());
				mapMsg.put("stiName", stuInfo.getStiName());
			}

			List list = studentRegisterService.getStudentRegisterByCondition("sti_id", stiId);
			if (list.size() > 0) {
				StudentRegister strInfo = (StudentRegister)list.get(0);
				String sciId = strInfo.getSciId();
				SystemClassInfo systemClassInfo = systemClassInfoService.getSystemClassInfoById(sciId);
				if(systemClassInfo != null) {
					mapMsg.put("sciId", sciId);
					mapMsg.put("sciName", systemClassInfo.getSciName());

					String sscCode = systemClassInfo.getSscCode();
					SystemSpecialtyCode ssc = systemSpecialtyCodeService.getSystemSpecialtyCodeByCode(sscCode);
					if(ssc != null) {
						mapMsg.put("strZymc", ssc.getSscName());
					}
				}

				mapMsg.put("msg", "该学生已经登记,请重新选择!");
			} else {
				StudentRegister strInfo = studentRegisterService.getStudentRegisterByMaxId();
				String maxId = "";
				if (strInfo != null) {
					String strId = strInfo.getStrId();
					String sub = strId.substring(3,strId.length());
					int id = Integer.parseInt(sub) + 1;
					maxId = String.format("STR%03d",id);
				} else {
					maxId = "STR001";
				}

				studentRegister.setStrId(maxId);
				String sciId = request.getParameter("sciId");
				SystemClassInfo systemClassInfo = systemClassInfoService.getSystemClassInfoById(sciId);
				if(systemClassInfo != null) {
					studentRegister.setSystemClassInfo(systemClassInfo);
					mapMsg.put("sciId", systemClassInfo.getSciId());
					mapMsg.put("sciName", systemClassInfo.getSciName());

					String sscCode = systemClassInfo.getSscCode();
					SystemSpecialtyCode ssc = systemSpecialtyCodeService.getSystemSpecialtyCodeByCode(sscCode);
					if(ssc != null) {
						String strZymc = ssc.getSscName();
						studentRegister.setStrZymc(strZymc);
						mapMsg.put("strZymc", strZymc);
					}
				}

				studentRegisterService.insertStudentRegister(studentRegister);
				mapMsg.put("msg", "学生登记信息数据录入成功!");
			}
		}

		String strDjrq = DateConverter.format(new Date(System.currentTimeMillis()));
		mapMsg.put("strDjrq", strDjrq);
		return new ModelAndView("memberview/stuinfo_register", "messages", mapMsg);
	}

	/**
	 * 功能：用于查询注册学生信息
	 * 实现：通过request请求参数中的stuid值来进行
	 *      判断学生ID是否存在
	 *
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("searchStudentRegister")
	public ModelAndView searchStudentRegister(HttpServletRequest request, HttpServletResponse response) {
		String field = request.getParameter("select_field");
		String operation = request.getParameter("select_operation");
		String condition = request.getParameter("condition");

		Map map = new HashMap();
		map.put("operation", operation);
		map.put("field", field);
		map.put("condition", condition);

		List list = studentRegisterService.getAllStudentRegister();
		String wheresql = null;
		if(field != null) {
			wheresql = String.format("sti_%s %s '%s'", field,operation,condition);
			list = studentRegisterService.getStudentRegisterBySql(wheresql);
		}

		if (list.size() == 0) {
			list = studentRegisterService.getAllStudentRegister();
			map.put("messages", list);
			map.put("msg", "系统提示：没有找到满足条件的数据! "+wheresql);
			return new ModelAndView("memberview/stuinfo_reglist", map);
		} else {
			map.put("messages", list);
			map.put("msg", null);
			return new ModelAndView("memberview/stuinfo_reglist", map);
		}
	}

	/**
	 * 功能：用于查询所有学生信息
	 * 实现：通过request请求参数中的stuid值来进行
	 *      判断学生ID是否存在
	 *
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("selectAllStudentInfo")
	public ModelAndView selectAllStudentInfo(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("listAllStu方法执行");
		List stuList = studentInfoService.getAllStudentInfo();
		System.out.println("学生数量：" + stuList.size());

		return new ModelAndView("memberview/stuinfo_reglist", "messages",
				stuList);
	}

	/**
	 * 功能：用于学生信息维护
	 * 实现：通过request请求参数中的stuid值来进行
	 *      判断学生ID是否存在
	 *
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("serviceStudentInfo")
	public ModelAndView serviceStudentInfo(HttpServletRequest request, HttpServletResponse response) {
		String conStr = request.getParameter("condition");
		String sValue = request.getParameter("strvalue");
		if (sValue == null) {
			conStr = "sti_id";
			sValue = "";
		}

		Map model = new HashMap();
		List stuList = studentInfoService.queryStudentInfoByCondition(conStr,sValue);
		model.put("messages", stuList);
		model.put("selectStr", conStr);
		model.put("conValue", sValue);
		return new ModelAndView("memberview/stuinfo_service", model);
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
	@RequestMapping("modifyStudentInfo")
	public ModelAndView modifyStudentInfo(HttpServletRequest request, HttpServletResponse response) {
		String stiId = request.getParameter("stiId");
		// System.out.println("修改方法中的id:" + id);
		// String sqlxxx = "from DocuStuRegister dsg where dsg.docuStuInfo
		// >'01010101'";
		// dao.DeleteObject(sqlxxx);

		StudentInfo stuInfo = studentInfoService.getStudentInfoById(stiId);
		if(stuInfo != null) {
			List<CourseInfo> courseInfos = stuInfo.getCourseInfos();
			if (courseInfos != null) {
				Iterator iter = courseInfos.iterator();
				while (iter.hasNext()) {
					CourseInfo csi = (CourseInfo) iter.next();
					if(csi != null) {
						System.out.println("ExamDate:" + csi.getCsiExamDate());
						System.out.println("grade:" + csi.getCsiGrade());
					}

				}
			}
		}
		return new ModelAndView("memberview/stuinfo_modify", "messages", stuInfo);
	}

	/**
	 * 功能：用于查询班级信息
	 * 实现：通过request请求参数中的stuid值来进行
	 *      判断学生ID是否存在
	 *
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("selectClassinfo")
	public ModelAndView selectClassinfo(HttpServletRequest request, HttpServletResponse response) {
		String name = request.getParameter("name");
		// 获得班级所有信息
		if (name.equals("csl") || name == "csl") {
			List classinfo = systemClassInfoService.getAllSystemClassInfo();
			List classlist = new ArrayList();
			for (int i = 0; i < classinfo.size(); i++) {
				SystemClassInfoList clt = new SystemClassInfoList();
				Object[] objcs = (Object[]) classinfo.get(i);
				clt.setSciId(objcs[0].toString());
				clt.setSciName(objcs[1].toString());
				clt.setSgcName(objcs[2].toString());
				clt.setSscName(objcs[3].toString());
				classlist.add(clt);
			}
			return new ModelAndView("sourceview/stuinfo_class", "classinfo", classlist);
			// 获得班级名称信息
		} else if (name.equals("cs2") || name == "cs2") {
			List classlist = systemClassInfoService.getAllSystemClassInfo();
			Map map = new HashMap();
			map.put("classinfo", classlist);
			map.put("newstuid", "");
			return new ModelAndView("sourceview/stuinfo_class", "messages", map);
		} else {
			return null;
		}
	}

	/**
	 * 功能：用于创建学生ID
	 * 实现：通过request请求参数中的stuid值来进行
	 *      判断学生ID是否存在
	 *
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("createMaxStudentInfoId")
	public ModelAndView createMaxStudentInfoId(HttpServletRequest request, HttpServletResponse response) {
		StudentInfo stuInfo = studentInfoService.getStudentInfoByMaxId();
		String maxId = "";
		if (stuInfo != null) {
			String stiId = stuInfo.getStiId();
			String sub = stiId.substring(3,stiId.length());
			int id = Integer.parseInt(sub) + 1;
			maxId = String.format("STI%03d",id);
		} else {
			maxId = "STI001";
		}

		List list = systemClassInfoService.getAllSystemClassInfo();;
		Map map = new HashMap();
		map.put("class", list);
		map.put("stiId", maxId);
		String sciId = request.getParameter("sciId");
		map.put("sciId", sciId);
		System.out.println(sciId);
		return new ModelAndView("memberview/stuinfo_insert", "messages", map);
	}
}