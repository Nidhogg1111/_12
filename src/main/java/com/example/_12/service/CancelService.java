package com.example._12.service;

import com.example._12.domain.PageBean;
import com.example._12.domain.Record;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CancelService {
   public PageBean<Record> selectCancelByPageAndContion(int currentage, int pageSize, Record rec);

   public void cancelRecord(Record rec);
}
