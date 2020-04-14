package com.service;

import com.model.CourseInfo;
import com.model.Login;
import com.model.TeacherInfo;

import java.util.List;
import java.util.Set;

/**
 * @author 信息化管理部-方波
 * @site http://www.cr121.com/
 * @company 中铁十二局集团第一工程有限公司
 * @create 2020-02-13 13:09
 */
public interface CourseInfoService {
    List<CourseInfo> getAllCourseInfo();

    CourseInfo getCourseInfoById(String id);

    CourseInfo getCourseInfoByMinId();

    CourseInfo getCourseInfoByMaxId();

    List<CourseInfo> getCourseInfoByStudentId(String id);

    List<CourseInfo> getByCourseCode(String code);

    List<CourseInfo> getCourseInfoByParam(CourseInfo record);

    List<CourseInfo> queryCourseInfoByParam(CourseInfo record);

    List<CourseInfo> getCourseInfoByCondition(String field, String value);

    List<CourseInfo> queryCourseInfoByCondition(String field, String value);

    List<CourseInfo> getCourseInfoFieldsByCondition(String fields, String field, String value);

    List<CourseInfo> queryCourseInfoFieldsByCondition(String fields, String field, String value);

    List<CourseInfo> getCourseInfoBySql(String sql);

    List<CourseInfo> getCourseInfoFieldsBySql(String fields, String sql);

    int insertCourseInfo(CourseInfo record);

    int setCourseInfoById(CourseInfo record);

    void delCourseInfoById(String id);
}