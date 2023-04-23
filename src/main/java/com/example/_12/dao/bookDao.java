package com.example._12.dao;

import com.example._12.domain.Record;
import com.example._12.domain.venue;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;

@Mapper
public interface bookDao {

    @Insert("insert into record values(#{id},#{coach},#{time},#{xuehao},null)")
    void addRecord(Record rec);
    public abstract List<venue> selectVenueByPageAndContion(@Param("begin") int begin, @Param("size") int size, @Param("ven") venue ven);

    public abstract int selectVenueTotalCountByContion(@Param("ven") venue ven);

    @Select("select * from Record")
    public abstract List<Record> selectRecord();
}
