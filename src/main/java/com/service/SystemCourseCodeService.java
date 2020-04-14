package com.service;

import com.model.SystemCourseCode;
import com.model.SystemGradeCode;
import com.model.TeacherInfo;

import java.util.List;

/**
 * @author 信息化管理部-方波
 * @site http://www.cr121.com/
 * @company 中铁十二局集团第一工程有限公司
 * @create 2020-02-13 13:09
 */
public interface SystemCourseCodeService {
    List<SystemCourseCode> getAllSystemCourseCode();

    SystemCourseCode getSystemCourseCodeByCode(String code);

    SystemCourseCode getSystemCourseCodeByMinId();

    SystemCourseCode getSystemCourseCodeByMaxId();

    SystemCourseCode getSystemCourseCodeByName(String name);

    List<SystemCourseCode> getSystemCourseCodeByParam(SystemCourseCode record);

    List<SystemCourseCode> querySystemCourseCodeByParam(SystemCourseCode record);

    List<SystemCourseCode> getSystemCourseCodeByCondition(String field, String value);

    List<SystemCourseCode> querySystemCourseCodeByCondition(String field, String value);

    List<SystemCourseCode> getSystemCourseCodeFieldsByCondition(String fields, String field, String value);

    List<SystemCourseCode> querySystemCourseCodeFieldsByCondition(String fields, String field, String value);

    List<SystemCourseCode> getSystemCourseCodeBySql(String sql);

    List<SystemCourseCode> getSystemCourseCodeFieldsBySql(String fields, String sql);

    int insertSystemCourseCode(SystemCourseCode record);

    int setSystemCourseCodeByCode(SystemCourseCode record);

    int delSystemCourseCodeByCode(String code);
}