package com.example._12.service;

import com.example._12.domain.Record;
import org.apache.ibatis.annotations.Param;

public interface zhifuService {
    int selectTotalCount(String rec);
}
