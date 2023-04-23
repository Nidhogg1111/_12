package com.example._12.service;

import com.example._12.domain.PageBean;
import com.example._12.domain.Student;
import org.apache.ibatis.annotations.Param;

public interface NormalService {
    PageBean<Student> selectByPageAndContion(@Param("begin") int begin, @Param("size") int size, @Param("student") Student student);

    void add(Student stu);

    void deleteByIds(@Param("ids") int[] ids);

    void updateByNum(Student student);


    void deleteById(int num);
}
