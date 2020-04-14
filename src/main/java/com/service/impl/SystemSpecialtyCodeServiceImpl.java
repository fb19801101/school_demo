package com.service.impl;

import com.mapper.SystemSpecialtyCodeMapper;
import com.model.SystemGradeCode;
import com.model.SystemSpecialtyCode;
import com.model.TeacherInfo;
import com.service.SystemSpecialtyCodeService;
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
public class SystemSpecialtyCodeServiceImpl implements SystemSpecialtyCodeService {

    @Autowired
    private SystemSpecialtyCodeMapper systemSpecialtyCodeMapper;

    @Override
    public List<SystemSpecialtyCode> getAllSystemSpecialtyCode() {
        return systemSpecialtyCodeMapper.selectAllModel();
    }

    @Override
    public SystemSpecialtyCode getSystemSpecialtyCodeByCode(String code) {
        return systemSpecialtyCodeMapper.selectByPrimaryKey(code);
    }

    @Override
    public SystemSpecialtyCode getSystemSpecialtyCodeByMinId() {
        return systemSpecialtyCodeMapper.selectByMinPrimaryKey();
    }

    @Override
    public SystemSpecialtyCode getSystemSpecialtyCodeByMaxId() {
        return systemSpecialtyCodeMapper.selectByMaxPrimaryKey();
    }

    @Override
    public SystemSpecialtyCode getSystemSpecialtyCodeByName(String name) {
        return systemSpecialtyCodeMapper.selectByName(name);
    }

    @Override
    public List<SystemSpecialtyCode> getSystemSpecialtyCodeByParam(SystemSpecialtyCode record) {
        return systemSpecialtyCodeMapper.selectByParam(record);
    }

    @Override
    public List<SystemSpecialtyCode> querySystemSpecialtyCodeByParam(SystemSpecialtyCode record) {
        return systemSpecialtyCodeMapper.queryByParam(record);
    }

    @Override
    public List<SystemSpecialtyCode> getSystemSpecialtyCodeByCondition(String field, String value) {
        return systemSpecialtyCodeMapper.selectByCondition(field,value);
    }

    @Override
    public List<SystemSpecialtyCode> querySystemSpecialtyCodeByCondition(String field, String value) {
        return systemSpecialtyCodeMapper.queryByCondition(field,value);
    }

    @Override
    public List<SystemSpecialtyCode> getSystemSpecialtyCodeFieldsByCondition(String fields, String field, String value) {
        return systemSpecialtyCodeMapper.selectFieldsByCondition(fields,field,value);
    }

    @Override
    public List<SystemSpecialtyCode> querySystemSpecialtyCodeFieldsByCondition(String fields, String field, String value) {
        return systemSpecialtyCodeMapper.queryFieldsByCondition(fields,field,value);
    }

    @Override
    public List<SystemSpecialtyCode> getSystemSpecialtyCodeBySql(String sql) {
        return systemSpecialtyCodeMapper.selectBySql(sql);
    }

    @Override
    public List<SystemSpecialtyCode> getSystemSpecialtyCodeFieldsBySql(String fields, String sql) {
        return systemSpecialtyCodeMapper.selectFieldsBySql(fields, sql);
    }

    @Override
    public int insertSystemSpecialtyCode(SystemSpecialtyCode record) {
        return systemSpecialtyCodeMapper.insert(record);
    }

    @Override
    public int setSystemSpecialtyCodeByCode(SystemSpecialtyCode record) {
        return systemSpecialtyCodeMapper.updateByPrimaryKey(record);
    }

    @Override
    public int delSystemSpecialtyCodeByCode(String code) {
        return systemSpecialtyCodeMapper.deleteByPrimaryKey(code);
    }
}