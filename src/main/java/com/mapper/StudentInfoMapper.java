package com.mapper;

import com.model.StudentInfo;
import com.model.StudentInfoExample;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * StudentInfoMapper继承基类
 */
@Repository
public interface StudentInfoMapper extends MyBatisBaseMapper<StudentInfo, String, StudentInfoExample> {
    @Select("select * from tb_student_info where sti_name = #{name}")
    StudentInfo selectByName(String name);
}