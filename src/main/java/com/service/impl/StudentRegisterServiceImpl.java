package com.service.impl;

import com.mapper.StudentRegisterMapper;
import com.model.StudentInfo;
import com.model.StudentRegister;
import com.model.SystemClassInfo;
import com.service.StudentRegisterService;
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
public class StudentRegisterServiceImpl implements StudentRegisterService {

    @Autowired
    private StudentRegisterMapper studentRegisterMapper;

    @Override
    public List<StudentRegister> getAllStudentRegister() {
        return studentRegisterMapper.selectAllModel();
    }

    @Override
    public StudentRegister getStudentRegisterById(String id) {
        return studentRegisterMapper.selectByPrimaryKey(id);
    }

    @Override
    public StudentRegister getStudentRegisterByMinId() {
        return studentRegisterMapper.selectByMinPrimaryKey();
    }

    @Override
    public StudentRegister getStudentRegisterByMaxId() {
        return studentRegisterMapper.selectByMaxPrimaryKey();
    }

    @Override
    public StudentRegister getStudentRegisterByClassId(String id) {
        return studentRegisterMapper.selectByClassId(id);
    }

    @Override
    public StudentRegister getStudentRegisterByStudentId(String id) {
        return studentRegisterMapper.selectByStudentId(id);
    }

    @Override
    public List<StudentRegister> getStudentRegisterByParam(StudentRegister record) {
        return studentRegisterMapper.selectByParam(record);
    }

    @Override
    public List<StudentRegister> queryStudentRegisterByParam(StudentRegister record) {
        return studentRegisterMapper.queryByParam(record);
    }

    @Override
    public List<StudentRegister> getStudentRegisterByCondition(String field, String value) {
        return studentRegisterMapper.selectByCondition(field,value);
    }

    @Override
    public List<StudentRegister> queryStudentRegisterByCondition(String field, String value) {
        return studentRegisterMapper.queryByCondition(field,value);
    }

    @Override
    public List<StudentRegister> getStudentRegisterFieldsByCondition(String fields, String field, String value) {
        return studentRegisterMapper.selectFieldsByCondition(fields,field,value);
    }

    @Override
    public List<StudentRegister> queryStudentRegisterFieldsByCondition(String fields, String field, String value) {
        return studentRegisterMapper.queryFieldsByCondition(fields,field,value);
    }

    @Override
    public List<StudentRegister> getStudentRegisterBySql(String sql) {
        return studentRegisterMapper.selectBySql(sql);
    }

    @Override
    public List<StudentRegister> getStudentRegisterFieldsBySql(String field, String sql) {
        return studentRegisterMapper.selectFieldsBySql(field,sql);
    }

    @Override
    public int insertStudentRegister(StudentRegister record) {
        return studentRegisterMapper.insert(record);
    }

    @Override
    public int setStudentRegisterById(StudentRegister record) {
        return studentRegisterMapper.updateByPrimaryKey(record);
    }

    @Override
    public void delStudentRegisterById(String id) {
        studentRegisterMapper.deleteByPrimaryKey(id);
    }
}