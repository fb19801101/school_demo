package com.mapper;

import com.model.CourseInfo;
import com.model.CourseInfoExample;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

/**
 * CourseInfoMapper继承基类
 */
@Repository
public interface CourseInfoMapper extends MyBatisBaseMapper<CourseInfo, String, CourseInfoExample> {
    @Select("select * from tb_course_info where scc_code = #{code}")
    List<CourseInfo> selectByCourseCode(String code);

    @Select("select * from tb_course_info where sti_id = #{id}")
    List<CourseInfo> selectByStudentId(String id);
}