package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.io.File;

/**
 * @author 信息化管理部-方波
 * @site http://www.cr121.com/
 * @company 中铁十二局集团第一工程有限公司
 * @create 2020-03-06 15:35
 */
@Controller
@RequestMapping("main")
public class LeftFormController {
    @RequestMapping("toLogin")
    public String toLogin(HttpServletRequest request, Model model) { //参数中传入Model
        model.addAttribute("name","com.mvc.controller"); //指定Model的值
        model.addAttribute("url","http://www.baidu.com/"); //指定Model的值

        String path = request.getSession().getServletContext().getRealPath(File.separator);
        System.setProperty("log4j.path",path);

        return "login/login";
    }

    @RequestMapping("toStudentMain")
    public String toStudentMain(HttpServletRequest request, Model model) { //参数中传入Model
        return "StudentMain";
    }

    @RequestMapping("toScoreMain")
    public String toScoreMain() {
        return "ScoreMain";
    }

    @RequestMapping("toTeacherMain")
    public String toTeacherMain() {
        return "TeacherMain";
    }

    @RequestMapping("toBookMain")
    public String toBookMain() {
        return "BookMain";
    }

    @RequestMapping("toSyscodeMain")
    public String toSyscodeMain() {
        return "SyscodeMain";
    }

    @RequestMapping("toUserMain")
    public String toUserMain() {
        return "UserMain";
    }

    @RequestMapping("toSysInfo")
    public String toSysInfo() {
        return "SysInfo";
    }
}