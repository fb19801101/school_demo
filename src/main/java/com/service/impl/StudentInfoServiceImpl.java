package com.service.impl;

import com.mapper.StudentInfoMapper;
import com.model.StudentInfo;
import com.model.StudentRegister;
import com.service.StudentInfoService;
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
public class StudentInfoServiceImpl implements StudentInfoService {

    @Autowired
    private StudentInfoMapper studentInfoMapper;

    @Override
    public List<StudentInfo> getAllStudentInfo() {
        return studentInfoMapper.selectAllModel();
    }

    @Override
    public StudentInfo getStudentInfoById(String id) {
        return studentInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public StudentInfo getStudentInfoByMinId() {
        return studentInfoMapper.selectByMinPrimaryKey();
    }

    @Override
    public StudentInfo getStudentInfoByMaxId() {
        return studentInfoMapper.selectByMaxPrimaryKey();
    }

    @Override
    public StudentInfo getStudentInfoByName(String name) {
        return studentInfoMapper.selectByName(name);
    }

    @Override
    public List<StudentInfo> getStudentInfoByParam(StudentInfo record) {
        return studentInfoMapper.selectByParam(record);
    }

    @Override
    public List<StudentInfo> queryStudentInfoByParam(StudentInfo record) {
        return studentInfoMapper.queryByParam(record);
    }

    @Override
    public List<StudentInfo> getStudentInfoByCondition(String field, String value) {
        return studentInfoMapper.selectByCondition(field,value);
    }

    @Override
    public List<StudentInfo> queryStudentInfoByCondition(String field, String value) {
        return studentInfoMapper.queryByCondition(field,value);
    }

    @Override
    public List<StudentInfo> getStudentInfoFieldsByCondition(String fields, String field, String value) {
        return studentInfoMapper.selectFieldsByCondition(fields,field,value);
    }

    @Override
    public List<StudentInfo> queryStudentInfoFieldsByCondition(String fields, String field, String value) {
        return studentInfoMapper.queryFieldsByCondition(fields,field,value);
    }

    @Override
    public List<StudentInfo> getStudentInfoBySql(String sql) {
        return studentInfoMapper.selectBySql(sql);
    }

    @Override
    public List<StudentInfo> getStudentInfoFieldsBySql(String field, String sql) {
        return studentInfoMapper.selectFieldsBySql(field,sql);
    }

    @Override
    public int insertStudentInfo(StudentInfo record) {
        return studentInfoMapper.insert(record);
    }

    @Override
    public int setStudentInfoById(StudentInfo record) {
        return studentInfoMapper.updateByPrimaryKey(record);
    }

    @Override
    public void delStudentInfoById(String id) {
        studentInfoMapper.deleteByPrimaryKey(id);
    }
}