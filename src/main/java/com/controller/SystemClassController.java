package com.controller;

import com.model.SystemClassInfo;
import com.model.SystemClassInfoList;
import com.model.SystemGradeCode;
import com.model.SystemSpecialtyCode;
import com.service.SystemClassInfoService;
import com.service.SystemGradeCodeService;
import com.service.SystemSpecialtyCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("main")
public class SystemClassController {
	private String pageView = null;

	public String getPageView() {
		return pageView;
	}

	public void setPageView(String pageView) {
		this.pageView = pageView;
	}

	@Autowired
	private SystemClassInfoService systemClassInfoService;

	@Autowired
	private SystemSpecialtyCodeService systemSpecialtyCodeService;

	@Autowired
	private SystemGradeCodeService systemGradeCodeService;

	@RequestMapping(value="sysclasscode", method= RequestMethod.POST)
	public ModelAndView sysclasscode(HttpServletRequest request, HttpServletResponse response) {
		String name = request.getParameter("classname");
		
		SystemClassInfo objclass = new SystemClassInfo();		
		String spcode = request.getParameter("hiddspcode");
		String grcode = request.getParameter("hiddgrcode");
		String newclassid = null;		 
		SystemClassInfo sci = new SystemClassInfo();
		sci.setSscCode(spcode);
		sci.setSgcCode(grcode);
		List maxclass = systemClassInfoService.getSystemClassInfoFieldsByParam("max(sci_id)", sci);

		Object maxobj = maxclass.get(0);
		if (maxobj==null) {
			newclassid = spcode + grcode + "01";
		} else {
			String a1 = maxobj.toString();
			int aa = Integer.parseInt(a1.substring(a1.length() - 2)) + 1;
			if(aa > 9){
				newclassid = (spcode + grcode + aa) + "";
			}else{
				newclassid = (spcode + grcode + "0" + aa) + "";
			}			
		}	
		objclass.setSciName(name);
		SystemSpecialtyCode spcodeobject = new SystemSpecialtyCode();
		spcodeobject.setSscCode(request.getParameter("hiddspcode"));
		SystemGradeCode grcodeobject = new SystemGradeCode();
		grcodeobject.setSgcCode(request.getParameter("hiddgrcode"));
		
		objclass.setSystemGradeCode(grcodeobject);
		objclass.setSystemSpecialtyCode(spcodeobject);
		
		objclass.setSciId(newclassid);
		systemClassInfoService.insertSystemClassInfo(objclass);
		Map mapMessage = new HashMap();				
		List gradeList = systemGradeCodeService.getAllSystemGradeCode();
		List specList = systemSpecialtyCodeService.getAllSystemSpecialtyCode();
		String classSql = null;
		List classinfo = systemClassInfoService.getAllSystemClassInfo();
		
		List classlist = new ArrayList();
		
		for(int i=0;i<classinfo.size();i++){
			SystemClassInfoList clt = new SystemClassInfoList();
			Object[] objcs = (Object[])classinfo.get(i);
			clt.setSciId(objcs[0].toString());
			clt.setSciName(objcs[1].toString());
			clt.setSgcName(objcs[2].toString());
			clt.setSscName(objcs[3].toString());
			classlist.add(clt);
		}		
	    mapMessage.put("classinfo",classlist);
		mapMessage.put("grade",gradeList);
		mapMessage.put("spec",specList);		
		return new ModelAndView(getPageView(),"messages",mapMessage);
	}
}
