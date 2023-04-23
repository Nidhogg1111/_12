package com.example._12.service;

import com.example._12.domain.Student;
import com.example._12.domain.logindata;
import com.example._12.domain.updateBase;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface UpdateService {

    public void updateBaseStudent(updateBase upd);

    public void updateBaseTeacher(updateBase upd);


    public void updateBaseNormalUser(updateBase upd);

    public Student selectStudentByNum(String num);

    public Student selectTeacherByNum(String num);

    public Student selectNormalUserByNum(String num);

    public void updateUserPassword(logindata ld);
}
