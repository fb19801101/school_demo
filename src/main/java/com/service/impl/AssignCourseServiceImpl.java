package com.service.impl;

import com.mapper.AssignCourseMapper;
import com.model.AssignCourse;
import com.service.AssignCourseService;
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
public class AssignCourseServiceImpl implements AssignCourseService {

    @Autowired
    private AssignCourseMapper assignCourseMapper;

    @Override
    public List<AssignCourse> getAllAssignCourse() {
        return assignCourseMapper.selectAllModel();
    }

    @Override
    public AssignCourse getAssignCourseById(String id) {
        return assignCourseMapper.selectByPrimaryKey(id);
    }

    @Override
    public AssignCourse getAssignCourseByMinId() {
        return assignCourseMapper.selectByMinPrimaryKey();
    }

    @Override
    public AssignCourse getAssignCourseByMaxId() {
        return assignCourseMapper.selectByMaxPrimaryKey();
    }

    @Override
    public AssignCourse getAssignCourseByTeacherId(String id) {
        return assignCourseMapper.selectByTeacherId(id);
    }

    @Override
    public AssignCourse getAssignCourseByCourseCode(String code) {
        return assignCourseMapper.selectByCourseCode(code);
    }

    @Override
    public List<AssignCourse> getAssignCourseByParam(AssignCourse record) {
        return assignCourseMapper.selectByParam(record);
    }

    @Override
    public List<AssignCourse> queryAssignCourseByParam(AssignCourse record) {
        return assignCourseMapper.queryByParam(record);
    }

    @Override
    public List<AssignCourse> getAssignCourseByCondition(String field, String value) {
        return assignCourseMapper.selectByCondition(field,value);
    }

    @Override
    public List<AssignCourse> queryAssignCourseByCondition(String field, String value) {
        return assignCourseMapper.queryByCondition(field,value);
    }

    @Override
    public List<AssignCourse> getAssignCourseFieldsByCondition(String fields, String field, String value) {
        return assignCourseMapper.selectFieldsByCondition(fields,field,value);
    }

    @Override
    public List<AssignCourse> queryAssignCourseFieldsByCondition(String fields, String field, String value) {
        return assignCourseMapper.queryFieldsByCondition(fields,field,value);
    }

    @Override
    public List<AssignCourse> getAssignCourseBySql(String sql) {
        return assignCourseMapper.selectBySql(sql);
    }

    @Override
    public List<AssignCourse> getAssignCourseFieldsBySql(String field, String sql) {
        return assignCourseMapper.selectFieldsBySql(field,sql);
    }

    @Override
    public int setAssignCourseById(AssignCourse record) {
        return assignCourseMapper.updateByPrimaryKey(record);
    }

    @Override
    public int insertAssignCourse(AssignCourse record) {
        return assignCourseMapper.insert(record);
    }

    @Override
    public void delAssignCourseById(String id) {
        assignCourseMapper.deleteByPrimaryKey(id);
    }
}