package com.service;

import com.model.*;

import java.util.List;

/**
 * @author 信息化管理部-方波
 * @site http://www.cr121.com/
 * @company 中铁十二局集团第一工程有限公司
 * @create 2020-02-13 13:09
 */
public interface LoginService {
    List<Login> getAllLogin();

    List<Student> getAllStudent();

    Login getLoginById(Integer id);

    Login getLoginByMinId();

    Login getLoginByMaxId();

    Login getLoginByName(String name);

    Login getLoginByUsername(String username);

    List<Login> getLoginByParam(Login record);

    List<Login> queryLoginByParam(Login record);

    List<Login> getLoginByCondition(String field, String value);

    List<Login> queryLoginByCondition(String field, String value);

    List<Login> getLoginFieldsByCondition(String fields, String field, String value);

    List<Login> queryLoginFieldsByCondition(String fields, String field, String value);

    List<Login> getLoginBySql(String sql);

    List<Login> getLoginFieldsBySql(String fields, String sql);

    int insertLogin(Login record);

    int setLoginById(Login record);

    void delLoginById(Integer id);

    Student getStudentByKey(Integer id, String no);

    Student getStudentByKey(StudentKey key);
}