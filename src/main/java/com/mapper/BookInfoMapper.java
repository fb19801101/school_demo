package com.mapper;

import com.model.BookInfo;
import com.model.BookInfoExample;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * BookInfoMapper继承基类
 */
@Repository
public interface BookInfoMapper extends MyBatisBaseMapper<BookInfo, String, BookInfoExample> {
    @Select("select * from tb_book_info where bki_name = #{name}")
    BookInfo selectByName(String name);
}