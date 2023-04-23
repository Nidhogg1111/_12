package com.example._12.service;

import com.example._12.domain.PageBean;
import com.example._12.domain.Student;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentService {
    PageBean<Student> selectByPageAndContion(@Param("begin") int begin, @Param("size") int size, @Param("student") Student student);

    void add(Student stu);

    void deleteByIds(@Param("ids") int[] ids);

    void updateByNum(Student student);


    void deleteById(int num);
}
