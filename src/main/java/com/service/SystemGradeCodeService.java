package com.service;

import com.model.SystemGradeCode;
import com.model.SystemGradeCode;
import com.model.SystemSpecialtyCode;
import com.model.TeacherInfo;

import java.util.List;

/**
 * @author 信息化管理部-方波
 * @site http://www.cr121.com/
 * @company 中铁十二局集团第一工程有限公司
 * @create 2020-02-13 13:09
 */
public interface SystemGradeCodeService {
    List<SystemGradeCode> getAllSystemGradeCode();

    SystemGradeCode getSystemGradeCodeByCode(String code);

    SystemGradeCode getSystemGradeCodeByMinId();

    SystemGradeCode getSystemGradeCodeByMaxId();

    SystemGradeCode getSystemGradeCodeByName(String name);

    List<SystemGradeCode> getSystemGradeCodeByParam(SystemGradeCode record);

    List<SystemGradeCode> querySystemGradeCodeByParam(SystemGradeCode record);

    List<SystemGradeCode> getSystemGradeCodeByCondition(String field, String value);

    List<SystemGradeCode> querySystemGradeCodeByCondition(String field, String value);

    List<SystemGradeCode> getSystemGradeCodeFieldsByCondition(String fields, String field, String value);

    List<SystemGradeCode> querySystemGradeCodeFieldsByCondition(String fields, String field, String value);

    List<SystemGradeCode> getSystemGradeCodeBySql(String sql);

    List<SystemGradeCode> getSystemGradeCodeFieldsBySql(String fields, String sql);

    int insertSystemGradeCode(SystemGradeCode record);

    int setSystemGradeCodeByCode(SystemGradeCode record);

    int delSystemGradeCodeByCode(String code);
}