package com.example._12.service.Impl;

import com.example._12.dao.RegDao;
import com.example._12.domain.logindata;
import com.example._12.service.RegService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegServiceImpl implements RegService {
    @Autowired
    RegDao regDao;

    @Override
    public void addUser(logindata data) {
        regDao.addUser(data);
    }
}
