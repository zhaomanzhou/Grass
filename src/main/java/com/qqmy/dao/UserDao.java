package com.qqmy.dao;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserDao {

    @Select("select password from t_user where username = #{username}")
    public String getPassword(String username);
}
