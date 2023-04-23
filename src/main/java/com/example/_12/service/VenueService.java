package com.example._12.service;

import com.example._12.domain.PageBean;
import com.example._12.domain.venue;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface VenueService {

    PageBean<venue> selectVenueByPageAndContion(int begin, int size, venue ven);

    void deleteVenueByIds( int[] ids);


    void updateVenue(venue ven);

    void deleteVenue(venue ven);
}
