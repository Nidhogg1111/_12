package com.example._12.dao;

import com.example._12.domain.Student;
import com.example._12.domain.logindata;
import com.example._12.domain.updateBase;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface UpdateDao {
    @Update("update student set name = #{upd.name} , age = #{upd.age} , sex = #{upd.sex} where num = #{upd.num}")
    void updateBaseStudent(@Param("upd") updateBase upd);

    @Update("update teacher set name = #{upd.name} , age = #{upd.age} , sex = #{upd.sex} where num = #{upd.num}")
    void updateBaseTeacher(@Param("upd") updateBase upd);

    @Update("update normaluser set name = #{upd.name} , age = #{upd.age} , sex = #{upd.sex} where num = #{upd.num}")
    void updateBaseNormalUser(@Param("upd") updateBase upd);

    @Select("select * from student where id = #{num}")
    Student selectStudentByNum(@Param("num") String num);

    @Select("select * from teacher where id = #{num}")
    Student selectTeacherByNum(@Param("num") String num);

    @Select("select * from normaluser where id = #{num}")
    Student selectNormalUserByNum(@Param("num") String num);

    @Update("update user set password = #{ld.password} where num = #{ld.num}")
    void updateUserPassword(@Param("ld") logindata ld);
}
