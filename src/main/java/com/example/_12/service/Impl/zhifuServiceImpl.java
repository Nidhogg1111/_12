package com.example._12.service.Impl;

import com.example._12.dao.zhifuDao;
import com.example._12.domain.Record;
import com.example._12.service.zhifuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class zhifuServiceImpl implements zhifuService {

    @Autowired
    zhifuDao zhifudao;
    @Override
    public int selectTotalCount(String rec) {
        return zhifudao.selectTotalCount(rec);
    }
}
