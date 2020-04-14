package com.mapper;

import com.model.BorrowInfo;
import com.model.BorrowInfoExample;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * BorrowInfoMapper继承基类
 */
@Repository
public interface BorrowInfoMapper extends MyBatisBaseMapper<BorrowInfo, String, BorrowInfoExample> {
    @Select("select * from tb_borrow_info where bki_id = #{id}")
    BorrowInfo selectByBookId(String id);

    @Select("select * from tb_borrow_info where sti_id = #{id}")
    BorrowInfo selectByStudentId(String id);

    @Select("select * from tb_borrow_info where bki_name = #{name}")
    BorrowInfo selectByBookName(String name);
}