package com.example._12.Controller;

import com.example._12.domain.Student;
import com.example._12.domain.logindata;
import com.example._12.domain.reg;
import com.example._12.service.NormalService;
import com.example._12.service.RegService;
import com.example._12.service.StudentService;
import com.example._12.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.BufferedReader;

@RestController
public class RegServlet {

    @Autowired
    RegService regService;
    @Autowired
    StudentService studentService;
    @Autowired
    TeacherService teacherService;
    @Autowired
    NormalService normalService;


    @PostMapping ("/webreg")
    public String Reg(@RequestBody reg Reg){


        String password = Reg.getPass();
        String check = Reg.getCheck();
        String age = Reg.getAge();
        String username = Reg.getUsername();
        String sex = Reg.getSex();
        String name = Reg.getName();
        String num = Reg.getNum();
        String radio = Reg.getRadio();


        Student stu1 = new Student();
        stu1.setName(name);
        stu1.setAge(Integer.parseInt(age));
        stu1.setId(num);
        stu1.setSex(sex);

        if ("1".equals(radio)) {
            studentService.add(stu1);
        } else if ("2".equals(radio)) {
            teacherService.add(stu1);
        } else normalService.add(stu1);


        logindata log = new logindata(username, password, radio, num);
        regService.addUser(log);

        return "success";
    }
}
