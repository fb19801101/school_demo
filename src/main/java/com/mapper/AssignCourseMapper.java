package com.mapper;

import com.model.AssignCourse;
import com.model.AssignCourseExample;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * EmplAssignCourseMapper继承基类
 */
@Repository
public interface AssignCourseMapper extends MyBatisBaseMapper<AssignCourse, String, AssignCourseExample> {
    @Select("select * from tb_assign_course where tea_id = #{id}")
    AssignCourse selectByTeacherId(String id);

    @Select("select * from tb_assign_course where scc_code = #{code}")
    AssignCourse selectByCourseCode(String code);
}