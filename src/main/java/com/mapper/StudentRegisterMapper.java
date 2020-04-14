package com.mapper;

import com.model.StudentRegister;
import com.model.StudentRegisterExample;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * StudentRegisterMapper继承基类
 */
@Repository
public interface StudentRegisterMapper extends MyBatisBaseMapper<StudentRegister, String, StudentRegisterExample> {
    @Select("select * from tb_student_register where sci_id = #{id}")
    StudentRegister selectByClassId(String id);

    @Select("select * from tb_student_register where sti_id = #{id}")
    StudentRegister selectByStudentId(String id);
}