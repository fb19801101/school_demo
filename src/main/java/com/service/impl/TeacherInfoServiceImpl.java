package com.service.impl;

import com.mapper.TeacherInfoMapper;
import com.model.TeacherInfo;
import com.service.TeacherInfoService;
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
public class TeacherInfoServiceImpl implements TeacherInfoService {

    @Autowired
    private TeacherInfoMapper teacherInfoMapper;

    @Override
    public List<TeacherInfo> getAllTeacherInfo() {
        return teacherInfoMapper.selectAllModel();
    }

    @Override
    public TeacherInfo getTeacherInfoById(String id) {
        return teacherInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public TeacherInfo getTeacherInfoByMinId() {
        return teacherInfoMapper.selectByMinPrimaryKey();
    }

    @Override
    public TeacherInfo getTeacherInfoByMaxId() {
        return teacherInfoMapper.selectByMaxPrimaryKey();
    }

    @Override
    public TeacherInfo getTeacherInfoBySpecialtyCode(String code) {
        return teacherInfoMapper.selectBySpecialtyCode(code);
    }

    @Override
    public TeacherInfo getTeacherInfoByName(String name) {
        return teacherInfoMapper.selectByName(name);
    }

    @Override
    public List<TeacherInfo> getTeacherInfoByParam(TeacherInfo record) {
        return teacherInfoMapper.selectByParam(record);
    }

    @Override
    public List<TeacherInfo> queryTeacherInfoByParam(TeacherInfo record) {
        return teacherInfoMapper.queryByParam(record);
    }

    @Override
    public List<TeacherInfo> getTeacherInfoByCondition(String field, String value) {
        return teacherInfoMapper.selectByCondition(field,value);
    }

    @Override
    public List<TeacherInfo> queryTeacherInfoByCondition(String field, String value) {
        return teacherInfoMapper.queryByCondition(field,value);
    }

    @Override
    public List<TeacherInfo> getTeacherInfoFieldsByParam(String fields, TeacherInfo record) {
        return teacherInfoMapper.selectFieldsByParam(fields,record);
    }

    @Override
    public List<TeacherInfo> queryTeacherInfoFieldsByParam(String fields, TeacherInfo record) {
        return teacherInfoMapper.queryFieldsByParam(fields,record);
    }

    @Override
    public List<TeacherInfo> getTeacherInfoFieldsByCondition(String fields, String field, String value) {
        return teacherInfoMapper.selectFieldsByCondition(fields,field,value);
    }

    @Override
    public List<TeacherInfo> queryTeacherInfoFieldsByCondition(String fields, String field, String value) {
        return teacherInfoMapper.queryFieldsByCondition(fields,field,value);
    }

    @Override
    public List<TeacherInfo> getTeacherBySql(String sql) {
        return teacherInfoMapper.selectBySql(sql);
    }

    @Override
    public List<TeacherInfo> getTeacherFieldsBySql(String fields, String sql) {
        return teacherInfoMapper.selectFieldsBySql(fields, sql);
    }

    @Override
    public int insertTeacherInfo(TeacherInfo record) {
        return teacherInfoMapper.insert(record);
    }

    @Override
    public int setTeacherInfoById(TeacherInfo record) {
        return teacherInfoMapper.updateByPrimaryKey(record);
    }

    @Override
    public void delTeacherInfoById(String id) {
        teacherInfoMapper.deleteByPrimaryKey(id);
    }
}