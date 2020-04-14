package com.service.impl;

import com.mapper.SystemClassInfoMapper;
import com.model.StudentRegister;
import com.model.SystemClassInfo;
import com.model.SystemCourseCode;
import com.service.SystemClassInfoService;
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
public class SystemClassInfoServiceImpl implements SystemClassInfoService {

    @Autowired
    private SystemClassInfoMapper systemClassInfoMapper;

    @Override
    public List<SystemClassInfo> getAllSystemClassInfo() {
        return systemClassInfoMapper.selectAllModel();
    }

    @Override
    public SystemClassInfo getSystemClassInfoById(String id) {
        return systemClassInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public SystemClassInfo getSystemClassInfoByMinId() {
        return systemClassInfoMapper.selectByMinPrimaryKey();
    }

    @Override
    public SystemClassInfo getSystemClassInfoByMaxId() {
        return systemClassInfoMapper.selectByMaxPrimaryKey();
    }

    @Override
    public SystemClassInfo getSystemClassInfoBySpecialtyCode(String code) {
        return systemClassInfoMapper.selectBySpecialtyCode(code);
    }

    @Override
    public SystemClassInfo getSystemClassInfoByGradeCode(String code) {
        return systemClassInfoMapper.selectByGradeCode(code);
    }

    @Override
    public List<SystemClassInfo> getSystemClassInfoByParam(SystemClassInfo record) {
        return systemClassInfoMapper.selectByParam(record);
    }

    @Override
    public List<SystemClassInfo> querySystemClassInfoByParam(SystemClassInfo record) {
        return systemClassInfoMapper.queryByParam(record);
    }

    @Override
    public List<SystemClassInfo> getSystemClassInfoByCondition(String field, String value) {
        return systemClassInfoMapper.selectByCondition(field,value);
    }

    @Override
    public List<SystemClassInfo> querySystemClassInfoByCondition(String field, String value) {
        return systemClassInfoMapper.queryByCondition(field,value);
    }

    @Override
    public List<SystemClassInfo> getSystemClassInfoFieldsByParam(String fields, SystemClassInfo record) {
        return systemClassInfoMapper.selectFieldsByParam(fields,record);
    }

    @Override
    public List<SystemClassInfo> querySystemClassInfoFieldsByParam(String fields, SystemClassInfo record) {
        return systemClassInfoMapper.queryFieldsByParam(fields,record);
    }

    @Override
    public List<SystemClassInfo> getSystemClassInfoFieldsByCondition(String fields, String field, String value) {
        return systemClassInfoMapper.selectFieldsByCondition(fields,field,value);
    }

    @Override
    public List<SystemClassInfo> querySystemClassInfoFieldsByCondition(String fields, String field, String value) {
        return systemClassInfoMapper.queryFieldsByCondition(fields,field,value);
    }

    @Override
    public List<SystemClassInfo> getSystemClassInfoBySql(String sql) {
        return systemClassInfoMapper.selectBySql(sql);
    }

    @Override
    public List<SystemClassInfo> getSystemClassInfoFieldsBySql(String field, String sql) {
        return systemClassInfoMapper.selectFieldsBySql(field,sql);
    }

    @Override
    public int insertSystemClassInfo(SystemClassInfo record) {
        return systemClassInfoMapper.insert(record);
    }

    @Override
    public int setSystemClassInfoById(SystemClassInfo record) {
        return systemClassInfoMapper.updateByPrimaryKey(record);
    }

    @Override
    public int delSystemClassInfoById(String id) {
       return systemClassInfoMapper.deleteByPrimaryKey(id);
    }
}