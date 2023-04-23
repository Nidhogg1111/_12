package com.example._12.dao;

import com.example._12.domain.logindata;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RegDao {
    @Insert("insert into user values(#{username},#{password},#{type},#{num})")
    void addUser(logindata data);
}
