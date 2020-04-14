package com.mapper;

import com.model.Login;
import com.model.LoginExample;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * LoginMapper继承基类
 */
@Repository
public interface LoginMapper extends MyBatisBaseMapper<Login, Integer, LoginExample> {
    @Select("select * from tb_login where name = #{name}")
    Login selectByName(String name);

    @Select("select * from tb_login where username = #{username}")
    Login selectByUsername(String username);
}