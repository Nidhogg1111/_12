package com.example._12.service;

import com.example._12.domain.PageBean;
import com.example._12.domain.Record;
import com.example._12.domain.venue;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface bookService {
    public abstract PageBean<venue> selectVenueByPageAndContion(int currentage, int pageSize, venue ven);

    public abstract List<Record> selectRecord();

    public  abstract void addRecord(Record rec);
}
