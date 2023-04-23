package com.example._12.service.Impl;

import com.example._12.dao.UpdateDao;
import com.example._12.domain.Student;
import com.example._12.domain.logindata;
import com.example._12.domain.updateBase;
import com.example._12.service.UpdateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UpdateServiceImpl implements UpdateService {

    @Autowired
    UpdateDao updateDao;
    public void updateBaseStudent(updateBase upd){
        updateDao.updateBaseStudent(upd);
    }

    public void updateBaseTeacher(updateBase upd){
        updateDao.updateBaseTeacher(upd);
    }


    public void updateBaseNormalUser(updateBase upd){
        updateDao.updateBaseNormalUser(upd);
    }

    public Student selectStudentByNum(String num){
        return updateDao.selectStudentByNum(num);
    }

    public Student selectTeacherByNum(String num){
        return updateDao.selectTeacherByNum(num);
    }

    public Student selectNormalUserByNum(String num){
        return updateDao.selectNormalUserByNum(num);
    }

    public  void updateUserPassword(logindata ld){
        updateDao.updateUserPassword(ld);
    }
}
