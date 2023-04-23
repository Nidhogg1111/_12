package com.example._12.service.Impl;

import com.example._12.dao.StudentDao;
import com.example._12.domain.PageBean;
import com.example._12.domain.Student;
import com.example._12.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;

    @Override
    public PageBean<Student> selectByPageAndContion(int currentage, int pageSize, Student student) {
        int begin = (currentage - 1) * pageSize;

        //处理student条件 进行模糊查询
        String name = student.getName();
        if (name != null && name.length() > 0) {
            student.setName("%" + name + "%");
        }

        List<Student> stu = studentDao.selectByPageAndContion(begin, pageSize, student);
        int total = studentDao.selectTotalCountByContion(student);

        //封装PageBean对象
        PageBean<Student> pageBean = new PageBean<Student>();
        pageBean.setRows(stu);
        pageBean.setTotalCount(total);

        return pageBean;
    }

    @Override
    public void add(Student stu) {
        studentDao.add(stu);
    }

    @Override
    public void deleteByIds(int[] ids) {
        studentDao.deleteByIds(ids);
    }

    @Override
    public void updateByNum(Student student) {
        studentDao.updateByNum(student);
    }

    @Override
    public void deleteById(int num) {
        studentDao.deleteById(num);
    }
}
