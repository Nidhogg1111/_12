package com.example._12.Controller;

import com.example._12.Utils.CookieUtils;
import com.example._12.dao.UpdateDao;
import com.example._12.domain.Student;
import com.example._12.domain.logindata;
import com.example._12.domain.updateBase;
import com.example._12.service.UpdateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;

@RestController
@RequestMapping("/Update")
public class UpdateServlet {
    @Autowired
    UpdateService updateService;

    @PutMapping("/updateovo")
    public String updateovo(@RequestBody updateBase upd){

        String status = upd.getStatus();
        if(status.equals("1"))
        {
            updateService.updateBaseStudent(upd);
        }
        else if(status.equals("2")){
            updateService.updateBaseTeacher(upd);
        }
        else{
            updateService.updateBaseNormalUser(upd);
        }
        return "success";
    }

    @GetMapping("/getCookie")
    public updateBase getCookie(HttpServletRequest request){
        updateBase stu =new updateBase();
        Cookie[] cookies=request.getCookies();
        stu.setName(CookieUtils.getCookie(cookies,"name").getValue());
        stu.setNum((CookieUtils.getCookie(cookies,"num").getValue()));
        stu.setSex(CookieUtils.getCookie(cookies,"sex").getValue());
        stu.setStatus(CookieUtils.getCookie(cookies,"radio").getValue());
        stu.setAge((CookieUtils.getCookie(cookies,"age").getValue()));
        return stu;
    }
    @GetMapping("/getCookie2")
    public updateBase getCookie2(HttpServletRequest request){
        updateBase stu =new updateBase();
        Cookie[] cookies=request.getCookies();
        stu.setName(CookieUtils.getCookie(cookies,"name").getValue());
        stu.setNum((CookieUtils.getCookie(cookies,"id").getValue()));
        stu.setSex(CookieUtils.getCookie(cookies,"sex").getValue());
        stu.setStatus(CookieUtils.getCookie(cookies,"radio").getValue());
        stu.setAge((CookieUtils.getCookie(cookies,"age").getValue()));
        return stu;
    }

    @PostMapping("/updateovo")
    public Student select(@RequestBody String num)  {

        Student stu;
        if("1".equals("1"))
        {
            stu = updateService.selectStudentByNum(num);
        }
        else if(num.equals("2")){
            stu = updateService.selectTeacherByNum(num);
        }
        else{
            stu = updateService.selectNormalUserByNum(num);
        }
        return stu;
    }

    @PutMapping("/updateUserPassword")
    public String updateUserPassword(@RequestBody logindata upd) {
        updateService.updateUserPassword(upd);
        System.out.println(upd);
        return "success";
    }
}
