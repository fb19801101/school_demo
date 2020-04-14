package com.service.impl;

import com.mapper.CourseInfoMapper;
import com.model.CourseInfo;
import com.service.CourseInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

/**
 * @author 信息化管理部-方波
 * @site http://www.cr121.com/
 * @company 中铁十二局集团第一工程有限公司
 * @create 2020-02-13 13:11
 */
@Service
public class CourseInfoServiceImpl implements CourseInfoService {

    @Autowired
    private CourseInfoMapper courseInfoMapper;

    @Override
    public List<CourseInfo> getAllCourseInfo() {
        return courseInfoMapper.selectAllModel();
    }

    @Override
    public CourseInfo getCourseInfoById(String id) {
        return courseInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public CourseInfo getCourseInfoByMinId() {
        return courseInfoMapper.selectByMinPrimaryKey();
    }

    @Override
    public CourseInfo getCourseInfoByMaxId() {
        return courseInfoMapper.selectByMaxPrimaryKey();
    }

    @Override
    public List<CourseInfo> getCourseInfoByStudentId(String id) {
        return courseInfoMapper.selectByStudentId(id);
    }

    @Override
    public List<CourseInfo> getByCourseCode(String code) {
        return courseInfoMapper.selectByCourseCode(code);
    }

    @Override
    public List<CourseInfo> getCourseInfoByParam(CourseInfo record) {
        return courseInfoMapper.selectByParam(record);
    }

    @Override
    public List<CourseInfo> queryCourseInfoByParam(CourseInfo record) {
        return courseInfoMapper.queryByParam(record);
    }

    @Override
    public List<CourseInfo> getCourseInfoByCondition(String field, String value) {
        return courseInfoMapper.selectByCondition(field,value);
    }

    @Override
    public List<CourseInfo> queryCourseInfoByCondition(String field, String value) {
        return courseInfoMapper.queryByCondition(field,value);
    }

    @Override
    public List<CourseInfo> getCourseInfoFieldsByCondition(String fields, String field, String value) {
        return courseInfoMapper.selectFieldsByCondition(fields,field,value);
    }

    @Override
    public List<CourseInfo> queryCourseInfoFieldsByCondition(String fields, String field, String value) {
        return courseInfoMapper.queryFieldsByCondition(fields,field,value);
    }

    @Override
    public List<CourseInfo> getCourseInfoBySql(String sql) {
        return courseInfoMapper.selectBySql(sql);
    }

    @Override
    public List<CourseInfo> getCourseInfoFieldsBySql(String field, String sql) {
        return courseInfoMapper.selectFieldsBySql(field,sql);
    }

    @Override
    public int setCourseInfoById(CourseInfo record) {
        return courseInfoMapper.updateByPrimaryKey(record);
    }

    @Override
    public int insertCourseInfo(CourseInfo record) {
        return courseInfoMapper.insert(record);
    }

    @Override
    public void delCourseInfoById(String id) {
        courseInfoMapper.deleteByPrimaryKey(id);
    }
}