package com.service;

import com.model.SystemSpecialtyCode;
import com.model.SystemSpecialtyCode;
import com.model.TeacherInfo;

import java.util.List;

/**
 * @author 信息化管理部-方波
 * @site http://www.cr121.com/
 * @company 中铁十二局集团第一工程有限公司
 * @create 2020-02-13 13:09
 */
public interface SystemSpecialtyCodeService {
    List<SystemSpecialtyCode> getAllSystemSpecialtyCode();

    SystemSpecialtyCode getSystemSpecialtyCodeByCode(String code);

    SystemSpecialtyCode getSystemSpecialtyCodeByMinId();

    SystemSpecialtyCode getSystemSpecialtyCodeByMaxId();

    SystemSpecialtyCode getSystemSpecialtyCodeByName(String name);

    List<SystemSpecialtyCode> getSystemSpecialtyCodeByParam(SystemSpecialtyCode record);

    List<SystemSpecialtyCode> querySystemSpecialtyCodeByParam(SystemSpecialtyCode record);

    List<SystemSpecialtyCode> getSystemSpecialtyCodeByCondition(String field, String value);

    List<SystemSpecialtyCode> querySystemSpecialtyCodeByCondition(String field, String value);

    List<SystemSpecialtyCode> getSystemSpecialtyCodeFieldsByCondition(String fields, String field, String value);

    List<SystemSpecialtyCode> querySystemSpecialtyCodeFieldsByCondition(String fields, String field, String value);

    List<SystemSpecialtyCode> getSystemSpecialtyCodeBySql(String sql);

    List<SystemSpecialtyCode> getSystemSpecialtyCodeFieldsBySql(String fields, String sql);

    int insertSystemSpecialtyCode(SystemSpecialtyCode record);

    int setSystemSpecialtyCodeByCode(SystemSpecialtyCode record);

    int delSystemSpecialtyCodeByCode(String code);
}