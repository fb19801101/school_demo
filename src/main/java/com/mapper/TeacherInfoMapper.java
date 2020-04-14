package com.mapper;

import com.model.TeacherInfo;
import com.model.TeacherInfoExample;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * TeacherInfoMapper继承基类
 */
@Repository
public interface TeacherInfoMapper extends MyBatisBaseMapper<TeacherInfo, String, TeacherInfoExample> {
    @Select("select * from tb_teacher_info where ssc_code = #{code}")
    TeacherInfo selectBySpecialtyCode(String code);

    @Select("select * from tb_teacher_info where tei_name = #{name}")
    TeacherInfo selectByName(String name);
}