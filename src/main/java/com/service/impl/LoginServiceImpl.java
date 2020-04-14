package com.service.impl;

import com.mapper.LoginMapper;
import com.mapper.StudentMapper;
import com.model.Login;
import com.model.Student;
import com.model.Login;
import com.model.StudentKey;
import com.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 信息化管理部-方波
 * @site http://www.cr121.com/
 * @company 中铁十二局集团第一工程有限公司
 * @create 2020-02-13 13:11
 */
@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginMapper loginMapper;
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Login> getAllLogin() {
        return loginMapper.selectAllModel();
    }

    @Override
    public List<Student> getAllStudent() {
        return studentMapper.selectAllModel();
    }

    @Override
    public Login getLoginById(Integer id) {
        return loginMapper.selectByPrimaryKey(id);
    }

    @Override
    public Login getLoginByMinId() {
        return loginMapper.selectByMinPrimaryKey();
    }

    @Override
    public Login getLoginByMaxId() {
        return loginMapper.selectByMaxPrimaryKey();
    }

    @Override
    public Login getLoginByName(String name) {
        return loginMapper.selectByName(name);
    }

    @Override
    public Login getLoginByUsername(String username) {
        return loginMapper.selectByUsername(username);
    }

    @Override
    public List<Login> getLoginByParam(Login record) {
        return loginMapper.selectByParam(record);
    }

    @Override
    public List<Login> queryLoginByParam(Login record) {
        return loginMapper.queryByParam(record);
    }

    @Override
    public List<Login> getLoginByCondition(String field, String value) {
        return loginMapper.selectByCondition(field,value);
    }

    @Override
    public List<Login> queryLoginByCondition(String field, String value) {
        return loginMapper.queryByCondition(field,value);
    }

    @Override
    public List<Login> getLoginFieldsByCondition(String fields, String field, String value) {
        return loginMapper.selectFieldsByCondition(fields,field,value);
    }

    @Override
    public List<Login> queryLoginFieldsByCondition(String fields, String field, String value) {
        return loginMapper.queryFieldsByCondition(fields,field,value);
    }

    @Override
    public List<Login> getLoginBySql(String sql) {
        return loginMapper.selectBySql(sql);
    }

    @Override
    public List<Login> getLoginFieldsBySql(String field, String sql) {
        return loginMapper.selectFieldsBySql(field,sql);
    }

    @Override
    public int insertLogin(Login record) {
        return loginMapper.insert(record);
    }

    @Override
    public int setLoginById(Login record) {
        return loginMapper.updateByPrimaryKey(record);
    }

    @Override
    public void delLoginById(Integer id) {
        loginMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Student getStudentByKey(Integer id, String no) {
        StudentKey key = new StudentKey();
        key.setId(id);
        key.setUserNo(no);
        return studentMapper.selectByPrimaryKey(key);
    }

    @Override
    public Student getStudentByKey(StudentKey key) {
        return studentMapper.selectByPrimaryKey(key);
    }
}