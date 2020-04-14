package com.service;

import com.model.StudentRegister;
import com.model.SystemClassInfo;
import com.model.TeacherInfo;

import java.util.List;

/**
 * @author 信息化管理部-方波
 * @site http://www.cr121.com/
 * @company 中铁十二局集团第一工程有限公司
 * @create 2020-02-13 13:09
 */
public interface StudentRegisterService {
    List<StudentRegister> getAllStudentRegister();

    StudentRegister getStudentRegisterById(String id);

    StudentRegister getStudentRegisterByMinId();

    StudentRegister getStudentRegisterByMaxId();

    StudentRegister getStudentRegisterByClassId(String id);

    StudentRegister getStudentRegisterByStudentId(String id);

    List<StudentRegister> getStudentRegisterByParam(StudentRegister record);

    List<StudentRegister> queryStudentRegisterByParam(StudentRegister record);

    List<StudentRegister> getStudentRegisterByCondition(String field, String value);

    List<StudentRegister> queryStudentRegisterByCondition(String field, String value);

    List<StudentRegister> getStudentRegisterFieldsByCondition(String fields, String field, String value);

    List<StudentRegister> queryStudentRegisterFieldsByCondition(String fields, String field, String value);

    List<StudentRegister> getStudentRegisterBySql(String sql);

    List<StudentRegister> getStudentRegisterFieldsBySql(String fields, String sql);

    int insertStudentRegister(StudentRegister record);

    int setStudentRegisterById(StudentRegister record);

    void delStudentRegisterById(String id);
}