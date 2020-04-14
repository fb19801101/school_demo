package com.service;

import com.model.SystemClassInfo;
import com.model.SystemCourseCode;
import com.model.TeacherInfo;

import java.util.List;

/**
 * @author 信息化管理部-方波
 * @site http://www.cr121.com/
 * @company 中铁十二局集团第一工程有限公司
 * @create 2020-02-13 13:09
 */
public interface SystemClassInfoService {
    List<SystemClassInfo> getAllSystemClassInfo();

    SystemClassInfo getSystemClassInfoById(String id);

    SystemClassInfo getSystemClassInfoByMinId();

    SystemClassInfo getSystemClassInfoByMaxId();

    SystemClassInfo getSystemClassInfoBySpecialtyCode(String code);

    SystemClassInfo getSystemClassInfoByGradeCode(String code);

    List<SystemClassInfo> getSystemClassInfoByParam(SystemClassInfo record);

    List<SystemClassInfo> querySystemClassInfoByParam(SystemClassInfo record);

    List<SystemClassInfo> getSystemClassInfoByCondition(String field, String value);

    List<SystemClassInfo> querySystemClassInfoByCondition(String field, String value);

    List<SystemClassInfo> getSystemClassInfoFieldsByParam(String fields, SystemClassInfo record);

    List<SystemClassInfo> querySystemClassInfoFieldsByParam(String fields, SystemClassInfo record);

    List<SystemClassInfo> getSystemClassInfoFieldsByCondition(String fields, String field, String value);

    List<SystemClassInfo> querySystemClassInfoFieldsByCondition(String fields, String field, String value);

    List<SystemClassInfo> getSystemClassInfoBySql(String sql);

    List<SystemClassInfo> getSystemClassInfoFieldsBySql(String fields, String sql);

    int insertSystemClassInfo(SystemClassInfo record);

    int setSystemClassInfoById(SystemClassInfo record);

    int delSystemClassInfoById(String id);
}