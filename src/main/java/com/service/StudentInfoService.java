package com.service;

import com.model.StudentInfo;
import com.model.StudentRegister;
import com.model.TeacherInfo;

import java.util.List;

/**
 * @author 信息化管理部-方波
 * @site http://www.cr121.com/
 * @company 中铁十二局集团第一工程有限公司
 * @create 2020-02-13 13:09
 */
public interface StudentInfoService {
    List<StudentInfo> getAllStudentInfo();

    StudentInfo getStudentInfoById(String id);

    StudentInfo getStudentInfoByMinId();

    StudentInfo getStudentInfoByMaxId();

    StudentInfo getStudentInfoByName(String name);

    List<StudentInfo> getStudentInfoByParam(StudentInfo record);

    List<StudentInfo> queryStudentInfoByParam(StudentInfo record);

    List<StudentInfo> getStudentInfoByCondition(String field, String value);

    List<StudentInfo> queryStudentInfoByCondition(String field, String value);

    List<StudentInfo> getStudentInfoFieldsByCondition(String fields, String field, String value);

    List<StudentInfo> queryStudentInfoFieldsByCondition(String fields, String field, String value);

    List<StudentInfo> getStudentInfoBySql(String sql);

    List<StudentInfo> getStudentInfoFieldsBySql(String fields, String sql);

    int insertStudentInfo(StudentInfo record);

    int setStudentInfoById(StudentInfo record);

    void delStudentInfoById(String id);
}