package com.example._12.dao;


import com.example._12.domain.Record;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface RecordDao {

    List<Record> selectCancelByPageAndContion(@Param("begin") int begin, @Param("size") int size, @Param("rec") Record rec);

    int selectCancelTotalCountByContion(@Param("rec") Record rec);

    @Insert("insert into record values(#{id},#{coach},#{time},#{xuehao},null)")
    void addRecord(Record rec);


    void deleteRecordByIds(@Param("ids") int[] ids);


    @Delete("delete from record where num = #{num}")
    void deleteRecordById(int num);


}
