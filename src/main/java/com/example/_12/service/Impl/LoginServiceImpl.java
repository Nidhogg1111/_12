package com.example._12.service.Impl;

import com.example._12.dao.LoginDao;
import com.example._12.domain.CoachUser;
import com.example._12.domain.GM;
import com.example._12.domain.Student;
import com.example._12.domain.logindata;
import com.example._12.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    LoginDao loginDao;


    @Override
    public List<CoachUser> selectCoachLogin(){
        return loginDao.selectCoachLogin();
    }

    @Override
    public List<GM> selectGM() {
        return loginDao.selectGM();
    }

    public List<logindata> selectLogin(){
        return loginDao.selectLogin();
    }

    public Student selectStudentByNum(String username){
        return loginDao.selectStudentByNum(username);
    }


    public Student selectTeacherByNum(String username){
        return loginDao.selectTeacherByNum(username);
    }
    public Student selectNormalByNum(String username){
        return loginDao.selectNormalByNum(username);
    }


}
