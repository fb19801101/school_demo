package com.mapper;

import com.model.AssignClass;
import com.model.AssignClassExample;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * EmplAssignChargeMapper继承基类
 */
@Repository
public interface AssignClassMapper extends MyBatisBaseMapper<AssignClass, String, AssignClassExample> {
    @Select("select * from tb_assign_class where tea_id = #{id}")
    AssignClass selectByTeacherId(String id);

    @Select("select * from tb_assign_class where sci_id = #{id}")
    AssignClass selectByClassId(String id);
}