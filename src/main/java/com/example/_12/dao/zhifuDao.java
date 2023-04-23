package com.example._12.dao;

import com.example._12.domain.Record;
import com.example._12.domain.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


@Mapper
public interface zhifuDao {
    int selectTotalCount(@Param("rec") String rec);
}
