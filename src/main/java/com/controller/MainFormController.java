package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @author 信息化管理部-方波
 * @site http://www.cr121.com/
 * @company 中铁十二局集团第一工程有限公司
 * @create 2020-03-06 15:35
 */
@Controller
@RequestMapping("main")
public class MainFormController {
    @RequestMapping("toMain")
    public String toMain() {
        return "MainView";
    }

    @RequestMapping("toLeft")
    public String toLeft() {
        return "LeftView";
    }

    @RequestMapping("toTop")
    public String toTop() {
        return "StudentMain";
    }

    @RequestMapping("toTitle")
    public String toTitle() {
        return "TitleView";
    }
}