package com.service.impl;

import com.mapper.SystemGradeCodeMapper;
import com.model.SystemCourseCode;
import com.model.SystemGradeCode;
import com.model.SystemSpecialtyCode;
import com.service.SystemGradeCodeService;
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
public class SystemGradeCodeServiceImpl implements SystemGradeCodeService {

    @Autowired
    private SystemGradeCodeMapper systemGradeCodeMapper;

    @Override
    public List<SystemGradeCode> getAllSystemGradeCode() {
        return systemGradeCodeMapper.selectAllModel();
    }

    @Override
    public SystemGradeCode getSystemGradeCodeByCode(String code) {
        return systemGradeCodeMapper.selectByPrimaryKey(code);
    }

    @Override
    public SystemGradeCode getSystemGradeCodeByMinId() {
        return systemGradeCodeMapper.selectByMinPrimaryKey();
    }

    @Override
    public SystemGradeCode getSystemGradeCodeByMaxId() {
        return systemGradeCodeMapper.selectByMaxPrimaryKey();
    }

    @Override
    public SystemGradeCode getSystemGradeCodeByName(String name) {
        return systemGradeCodeMapper.selectByName(name);
    }

    @Override
    public List<SystemGradeCode> getSystemGradeCodeByParam(SystemGradeCode record) {
        return systemGradeCodeMapper.selectByParam(record);
    }

    @Override
    public List<SystemGradeCode> querySystemGradeCodeByParam(SystemGradeCode record) {
        return systemGradeCodeMapper.queryByParam(record);
    }

    @Override
    public List<SystemGradeCode> getSystemGradeCodeByCondition(String field, String value) {
        return systemGradeCodeMapper.selectByCondition(field,value);
    }

    @Override
    public List<SystemGradeCode> querySystemGradeCodeByCondition(String field, String value) {
        return systemGradeCodeMapper.queryByCondition(field,value);
    }

    @Override
    public List<SystemGradeCode> getSystemGradeCodeFieldsByCondition(String fields, String field, String value) {
        return systemGradeCodeMapper.selectFieldsByCondition(fields,field,value);
    }

    @Override
    public List<SystemGradeCode> querySystemGradeCodeFieldsByCondition(String fields, String field, String value) {
        return systemGradeCodeMapper.queryFieldsByCondition(fields,field,value);
    }

    @Override
    public List<SystemGradeCode> getSystemGradeCodeBySql(String sql) {
        return systemGradeCodeMapper.selectBySql(sql);
    }

    @Override
    public List<SystemGradeCode> getSystemGradeCodeFieldsBySql(String field, String sql) {
        return systemGradeCodeMapper.selectFieldsBySql(field,sql);
    }

    @Override
    public int insertSystemGradeCode(SystemGradeCode record) {
        return systemGradeCodeMapper.insert(record);
    }

    @Override
    public int setSystemGradeCodeByCode(SystemGradeCode record) {
        return systemGradeCodeMapper.updateByPrimaryKey(record);
    }

    @Override
    public int delSystemGradeCodeByCode(String code) {
        return systemGradeCodeMapper.deleteByPrimaryKey(code);
    }
}