package com.mapper;

import com.model.SystemCourseCode;
import com.model.SystemSpecialtyCode;
import com.model.SystemSpecialtyCodeExample;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * SystemSpecialtyCodeMapper继承基类
 */
@Repository
public interface SystemSpecialtyCodeMapper extends MyBatisBaseMapper<SystemSpecialtyCode, String, SystemSpecialtyCodeExample> {
    @Select("select * from tb_system_specialty_code where ssc_name = #{name}")
    SystemSpecialtyCode selectByName(String name);
}