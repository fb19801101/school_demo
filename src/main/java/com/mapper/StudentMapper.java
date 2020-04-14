package com.mapper;

import com.model.Student;
import com.model.StudentExample;
import com.model.StudentKey;
import org.springframework.stereotype.Repository;

/**
 * StudentMapper继承基类
 */
@Repository
public interface StudentMapper extends MyBatisBaseMapper<Student, StudentKey, StudentExample> {
}