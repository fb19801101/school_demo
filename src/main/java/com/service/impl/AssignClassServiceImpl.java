package com.service.impl;

import com.mapper.AssignClassMapper;
import com.model.AssignClass;
import com.service.AssignClassService;
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
public class AssignClassServiceImpl implements AssignClassService {

    @Autowired
    private AssignClassMapper assignClassMapper;

    @Override
    public List<AssignClass> getAllAssignClass() {
        return assignClassMapper.selectAllModel();
    }

    @Override
    public AssignClass getAssignClassById(String id) {
        return assignClassMapper.selectByPrimaryKey(id);
    }

    @Override
    public AssignClass getAssignClassByMinId() {
        return assignClassMapper.selectByMinPrimaryKey();
    }

    @Override
    public AssignClass getAssignClassByMaxId() {
        return assignClassMapper.selectByMaxPrimaryKey();
    }

    @Override
    public AssignClass getAssignClassByTeacherId(String id) {
        return assignClassMapper.selectByTeacherId(id);
    }

    @Override
    public AssignClass getAssignClassByClassId(String id) {
        return assignClassMapper.selectByClassId(id);
    }

    @Override
    public List<AssignClass> getAssignClassByParam(AssignClass record) {
        return assignClassMapper.selectByParam(record);
    }

    @Override
    public List<AssignClass> queryAssignClassByParam(AssignClass record) {
        return assignClassMapper.queryByParam(record);
    }

    @Override
    public List<AssignClass> getAssignClassByCondition(String field, String value) {
        return assignClassMapper.selectByCondition(field,value);
    }

    @Override
    public List<AssignClass> queryAssignClassByCondition(String field, String value) {
        return assignClassMapper.queryByCondition(field,value);
    }
    @Override
    public List<AssignClass> getAssignClassFieldsByCondition(String fields, String field, String value) {
        return assignClassMapper.selectFieldsByCondition(fields,field,value);
    }

    @Override
    public List<AssignClass> queryAssignClassFieldsByCondition(String fields, String field, String value) {
        return assignClassMapper.queryFieldsByCondition(fields,field,value);
    }

    @Override
    public List<AssignClass> getAssignClassBySql(String sql) {
        return assignClassMapper.selectBySql(sql);
    }

    @Override
    public List<AssignClass> getAssignClassFieldsBySql(String field, String sql) {
        return assignClassMapper.selectFieldsBySql(field,sql);
    }

    @Override
    public int insertAssignClass(AssignClass record) {
        return assignClassMapper.insert(record);
    }

    @Override
    public int setAssignClassById(AssignClass record) {
        return assignClassMapper.updateByPrimaryKey(record);
    }

    @Override
    public void delAssignClassById(String id) {
        assignClassMapper.deleteByPrimaryKey(id);
    }
}