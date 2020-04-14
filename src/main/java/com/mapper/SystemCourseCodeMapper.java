package com.mapper;

import com.model.SystemClassInfo;
import com.model.SystemCourseCode;
import com.model.SystemCourseCodeExample;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * SystemCourseCodeMapper继承基类
 */
@Repository
public interface SystemCourseCodeMapper extends MyBatisBaseMapper<SystemCourseCode, String, SystemCourseCodeExample> {
    @Select("select * from tb_system_course_code where scc_name = #{name}")
    SystemCourseCode selectByName(String name);
}