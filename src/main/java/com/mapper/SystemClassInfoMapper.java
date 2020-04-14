package com.mapper;

import com.model.StudentRegister;
import com.model.SystemClassInfo;
import com.model.SystemClassInfoExample;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;

import java.util.List;

/**
 * SystemClassInfoMapper继承基类
 */
@Repository
public interface SystemClassInfoMapper extends MyBatisBaseMapper<SystemClassInfo, String, SystemClassInfoExample> {
    @Select("select * from tb_system_class_info where ssc_code = #{code}")
    SystemClassInfo selectBySpecialtyCode(String code);

    @Select("select * from tb_system_class_info where sgc_code = #{code}")
    SystemClassInfo selectByGradeCode(String code);
}