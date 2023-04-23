package com.example._12.dao;

import com.example._12.domain.Record;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


@Mapper
public interface CoachConDao {
    List<Record> selectCancelByPageAndContion(@Param("begin") int begin, @Param("size") int size, @Param("rec") Record rec);

    int selectCancelTotalCountByContion(@Param("rec") Record rec);

}
