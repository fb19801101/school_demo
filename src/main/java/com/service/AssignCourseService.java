package com.service;

import com.model.AssignCourse;

import java.util.List;

/**
 * @author 信息化管理部-方波
 * @site http://www.cr121.com/
 * @company 中铁十二局集团第一工程有限公司
 * @create 2020-02-13 13:09
 */
public interface AssignCourseService {
    List<AssignCourse> getAllAssignCourse();

    AssignCourse getAssignCourseById(String id);

    AssignCourse getAssignCourseByMinId();

    AssignCourse getAssignCourseByMaxId();

    AssignCourse getAssignCourseByTeacherId(String id);

    AssignCourse getAssignCourseByCourseCode(String code);

    List<AssignCourse> getAssignCourseByParam(AssignCourse record);

    List<AssignCourse> queryAssignCourseByParam(AssignCourse record);

    List<AssignCourse> getAssignCourseByCondition(String field, String value);

    List<AssignCourse> queryAssignCourseByCondition(String field, String value);

    List<AssignCourse> getAssignCourseFieldsByCondition(String fields, String field, String value);

    List<AssignCourse> queryAssignCourseFieldsByCondition(String fields, String field, String value);

    List<AssignCourse> getAssignCourseBySql(String sql);

    List<AssignCourse> getAssignCourseFieldsBySql(String fields, String sql);

    int insertAssignCourse(AssignCourse record);

    int setAssignCourseById(AssignCourse record);

    void delAssignCourseById(String id);
}