package com.example._12.dao;

import com.example._12.domain.CoachUser;
import com.example._12.domain.GM;
import com.example._12.domain.Student;
import com.example._12.domain.logindata;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;


@Mapper
public interface LoginDao {
    @Select("select * from GM")
    List<GM> selectGM();

    @Select("select * from user")
    List<logindata> selectLogin();

    @Select("select * from coachuser")
    List<CoachUser> selectCoachLogin();



    Student selectStudentByNum(@Param("username") String username);

    Student selectTeacherByNum(@Param("username") String username);

    Student selectNormalByNum(@Param("username") String username);
}
