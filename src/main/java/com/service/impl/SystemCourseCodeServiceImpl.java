package com.service.impl;

import com.mapper.SystemCourseCodeMapper;
import com.model.SystemClassInfo;
import com.model.SystemCourseCode;
import com.model.SystemGradeCode;
import com.service.SystemCourseCodeService;
import com.service.SystemCourseCodeService;
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
public class SystemCourseCodeServiceImpl implements SystemCourseCodeService {

    @Autowired
    private SystemCourseCodeMapper systemCourseCodeMapper;

    @Override
    public List<SystemCourseCode> getAllSystemCourseCode() {
        return systemCourseCodeMapper.selectAllModel();
    }

    @Override
    public SystemCourseCode getSystemCourseCodeByCode(String code) {
        return systemCourseCodeMapper.selectByPrimaryKey(code);
    }

    @Override
    public SystemCourseCode getSystemCourseCodeByMinId() {
        return systemCourseCodeMapper.selectByMinPrimaryKey();
    }

    @Override
    public SystemCourseCode getSystemCourseCodeByMaxId() {
        return systemCourseCodeMapper.selectByMaxPrimaryKey();
    }

    @Override
    public SystemCourseCode getSystemCourseCodeByName(String name) {
        return systemCourseCodeMapper.selectByName(name);
    }

    @Override
    public List<SystemCourseCode> getSystemCourseCodeByParam(SystemCourseCode record) {
        return systemCourseCodeMapper.selectByParam(record);
    }

    @Override
    public List<SystemCourseCode> querySystemCourseCodeByParam(SystemCourseCode record) {
        return systemCourseCodeMapper.queryByParam(record);
    }

    @Override
    public List<SystemCourseCode> getSystemCourseCodeByCondition(String field, String value) {
        return systemCourseCodeMapper.selectByCondition(field,value);
    }

    @Override
    public List<SystemCourseCode> querySystemCourseCodeByCondition(String field, String value) {
        return systemCourseCodeMapper.queryByCondition(field,value);
    }

    @Override
    public List<SystemCourseCode> getSystemCourseCodeFieldsByCondition(String fields, String field, String value) {
        return systemCourseCodeMapper.selectFieldsByCondition(fields,field,value);
    }

    @Override
    public List<SystemCourseCode> querySystemCourseCodeFieldsByCondition(String fields, String field, String value) {
        return systemCourseCodeMapper.queryFieldsByCondition(fields,field,value);
    }

    @Override
    public List<SystemCourseCode> getSystemCourseCodeBySql(String sql) {
        return systemCourseCodeMapper.selectBySql(sql);
    }

    @Override
    public List<SystemCourseCode> getSystemCourseCodeFieldsBySql(String field, String sql) {
        return systemCourseCodeMapper.selectFieldsBySql(field,sql);
    }

    @Override
    public int insertSystemCourseCode(SystemCourseCode record) {
        return systemCourseCodeMapper.insert(record);
    }

    @Override
    public int setSystemCourseCodeByCode(SystemCourseCode record) {
        return systemCourseCodeMapper.updateByPrimaryKey(record);
    }

    @Override
    public int delSystemCourseCodeByCode(String code) {
        return systemCourseCodeMapper.deleteByPrimaryKey(code);
    }
}