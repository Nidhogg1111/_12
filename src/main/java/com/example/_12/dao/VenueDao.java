package com.example._12.dao;

import com.example._12.domain.venue;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import java.util.List;


@Mapper
public interface VenueDao {

    List<venue> selectVenueByPageAndContion(@Param("begin") int begin, @Param("size") int size, @Param("ven") venue ven);

    int selectVenueTotalCountByContion(@Param("ven") venue ven);
    void deleteVenueByIds(@Param("ids") int[] ids);


    @Update("update venue set coach = #{ven.coach} , introducetion = #{ven.introducetion} where id = #{ven.id} and time = #{ven.time}")
    void updateVenue(@Param("ven") venue ven);

    @Delete("delete from venue where num = #{ven.num}")
    void deleteVenue(@Param("ven") venue ven);
}
