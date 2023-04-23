package com.example._12.service;

import com.example._12.domain.PageBean;
import com.example._12.domain.Record;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CoachConService {
    PageBean<Record> selectCancelByPageAndContion(int begin, int size, Record rec);
}
