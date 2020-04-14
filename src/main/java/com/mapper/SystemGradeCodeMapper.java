package com.mapper;

import com.model.SystemCourseCode;
import com.model.SystemGradeCode;
import com.model.SystemGradeCodeExample;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * SystemGradeCodeMapper继承基类
 */
@Repository
public interface SystemGradeCodeMapper extends MyBatisBaseMapper<SystemGradeCode, String, SystemGradeCodeExample> {
    @Select("select * from tb_system_grade_code where sgc_name = #{name}")
    SystemGradeCode selectByName(String name);
}