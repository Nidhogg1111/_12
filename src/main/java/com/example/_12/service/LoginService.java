package com.example._12.service;

import com.example._12.domain.CoachUser;
import com.example._12.domain.GM;
import com.example._12.domain.Student;
import com.example._12.domain.logindata;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface LoginService {
    List<CoachUser> selectCoachLogin();

    List<GM> selectGM();

    List<logindata> selectLogin();

    Student selectStudentByNum(String username);

    public Student selectTeacherByNum(String username);
    public Student selectNormalByNum(String username);
}
