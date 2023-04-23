package com.example._12.dao;

import com.example._12.domain.Record;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CancelDao {
    List<Record> selectCancelByPageAndContion(@Param("begin") int begin, @Param("size") int size, @Param("rec") Record rec);

    int selectCancelTotalCountByContion(@Param("rec") Record rec);

    @Delete("delete from record where  num = #{rec.num}")
    void cancelRecord(@Param("rec") Record rec);

}
