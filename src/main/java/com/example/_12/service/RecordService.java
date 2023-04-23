package com.example._12.service;

import com.example._12.domain.PageBean;
import com.example._12.domain.Record;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RecordService {
    PageBean<Record> selectCancelByPageAndContion(int begin, int size,  Record rec);

    void addRecord(Record rec);


    void deleteRecordByIds( int[] ids);


    void deleteRecordById(int num);
}
