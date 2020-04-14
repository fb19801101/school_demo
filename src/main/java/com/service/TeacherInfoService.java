package com.service;

import com.model.TeacherInfo;

import java.util.List;

/**
 * @author 信息化管理部-方波
 * @site http://www.cr121.com/
 * @company 中铁十二局集团第一工程有限公司
 * @create 2020-02-13 13:09
 */
public interface TeacherInfoService {
    List<TeacherInfo> getAllTeacherInfo();

    TeacherInfo getTeacherInfoById(String id);

    TeacherInfo getTeacherInfoByMinId();

    TeacherInfo getTeacherInfoByMaxId();

    TeacherInfo getTeacherInfoBySpecialtyCode(String code);

    TeacherInfo getTeacherInfoByName(String name);

    List<TeacherInfo> getTeacherInfoByParam(TeacherInfo record);

    List<TeacherInfo> queryTeacherInfoByParam(TeacherInfo record);

    List<TeacherInfo> getTeacherInfoByCondition(String field, String value);

    List<TeacherInfo> queryTeacherInfoByCondition(String field, String value);

    List<TeacherInfo> getTeacherInfoFieldsByParam(String fields, TeacherInfo record);

    List<TeacherInfo> queryTeacherInfoFieldsByParam(String fields, TeacherInfo record);

    List<TeacherInfo> getTeacherInfoFieldsByCondition(String fields, String field, String value);

    List<TeacherInfo> queryTeacherInfoFieldsByCondition(String fields, String field, String value);

    List<TeacherInfo> getTeacherBySql(String sql);

    List<TeacherInfo> getTeacherFieldsBySql(String fields, String sql);

    int insertTeacherInfo(TeacherInfo record);

    int setTeacherInfoById(TeacherInfo record);

    void delTeacherInfoById(String id);
}