package com.controller;

import com.model.Login;
import com.model.Student;
import com.service.LoginService;
import net.sf.json.JSONObject;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("main")
public class LoginController {
    private String username;

    private String password;

    private String resultJson;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getResultJson() {
        return resultJson;
    }

    public void setResultJson(String resultJson) {
        this.resultJson = resultJson;
    }

    private static Logger logger = Logger.getLogger("secondLogger");

    /**
     * struts 接收参数三种方式：属性方式接收，JavaBean方式接收，ModelDriven方式接收参数,前两种都必须设置get和set方法
     * */
    //Spring 注入方式
    @Autowired
    private LoginService loginService;

    @RequestMapping(value="_login", method=RequestMethod.POST)
    public String login(HttpServletRequest request, HttpServletResponse response) {
        JSONObject result = new JSONObject();
        username = request.getParameter("username");
        password = request.getParameter("password");
        Login user = loginService.getLoginByUsername(username);

        if (user != null) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password))
            {
                logger.info("The User Login Success.");
                result.put("message", "登录成功");
                result.put("status", "success");
                resultJson = result.toString();
                request.setAttribute("resultJson", resultJson);
                request.setAttribute("user", user);
                List<Student> students = loginService.getAllStudent();
                request.setAttribute("students", students);
                request.setAttribute("message", "登录成功");
                writeResponseData(response, result);

                String bean = request.getParameter("bean");
                if(bean != null && bean.equals("UseBean")) {
                    return "login/result";
                } else {
                    return "login/success";
                }
            } else {
                logger.debug("The User Login Error, Because Password Is Failed.");
                result.put("message", "登录失败");
                result.put("status", "error");
                resultJson = result.toString();
                request.setAttribute("resultJson", resultJson);
                request.setAttribute("user", user);
                request.setAttribute("message", "登录失败");
                writeResponseData(response, result);
                return "login/error";
            }
        }
        else {
            logger.error("The User Login Failed, Because The User Is Failed.");
            result.put("message", "用户失效");
            result.put("status", "failed");
            resultJson = result.toString();
            request.setAttribute("resultJson", resultJson);
            request.setAttribute("message", "用户失效");
            writeResponseData(response, result);
            return "login/failed";
        }
    }

    @RequestMapping(value="login")
    public ModelAndView login(HttpServletRequest request) {
        Map model = new HashMap();
        HttpSession session = request.getSession();
        String user = request.getParameter("username");
        String pass = request.getParameter("password");
        String action = request.getParameter("action");
        if (action == null) {
            Login record = new Login();
            record.setUsername(user);
            record.setPassword(pass);
            List<Login> records = loginService.getLoginByParam(record);
            if (records.size() > 0) {
                session.setAttribute("loginUser", records.get(0));
                model.put("message", "<script type=\"text/javascript\">parent.topMenuFrame.location.reload();</script>");
            } else {
                model.put("message", "用户名不存在或密码错误。");
            }
        }else{
            session.removeAttribute("loginUser");
        }
        return new ModelAndView("LeftView", model);
    }

    @RequestMapping(value="logout")
    public String login() {
        return "LeftView";
    }

    @RequestMapping("addUser")
    protected ModelAndView addUser(Login user, HttpServletRequest request, HttpServletResponse response) {
        HttpSession session = request.getSession();
        Login manager = (Login) session.getAttribute("loginUser");
        Map model = new HashMap();
        if (manager != null && manager.getUsername().equals("admin")) {
            if(user.getUsername() != null) {
                if (loginService.getLoginByUsername(user.getUsername()) != null) {
                    model.put("message", "登录名称已经存在，请更换用户名。");
                } else {
                    loginService.insertLogin(user);
                    model.put("message", "用户\"" + user.getName() + "\"添加成功。");
                }
            }
        } else {
            model.put("message", "权限不够或未登录，请返回登陆。");
        }

        return new ModelAndView("userview/addUser",model);
    }

    @RequestMapping("searchUser")
    protected ModelAndView searchUser(HttpServletRequest request, HttpServletResponse response) {
        Map model = new HashMap();
        String condition = request.getParameter("condition");
        String conditionContent = request.getParameter("conditionContent");
        if (conditionContent == null) {
            conditionContent = "jsp";
        }
        if (condition == null) {
            condition = "username";
        }

        List list = loginService.getLoginByCondition(condition, conditionContent);
        model.put("list", list);
        model.put("condition", condition);
        model.put("conditionContent", conditionContent);
        return new ModelAndView("userview/searchUser", model);
    }

    @RequestMapping("deleteUser")
    protected ModelAndView deleteUser(HttpServletRequest request, HttpServletResponse response) {
        Map model = new HashMap();
        String id = request.getParameter("id");
        if (id != null) {
            int _id = Integer.parseInt(id);
            Login user = loginService.getLoginById(_id);
            if (!user.getUsername().equals("jsp")) {
                loginService.delLoginById(_id);
                model.put("message", "删除用户成功。");
            } else {
                model.put("message", "不能删除初始用户。");
            }
        }

        return new ModelAndView("userview/searchUser", model);
    }

    private void writeResponseData(HttpServletResponse response, Object data) {
        response.setContentType("text/html;charset=utf-8");
        try
        {
            PrintWriter out = response.getWriter();
            out.println(data.toString());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}