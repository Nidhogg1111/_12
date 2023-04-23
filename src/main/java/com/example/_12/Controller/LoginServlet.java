package com.example._12.Controller;


import com.example._12.domain.CoachUser;
import com.example._12.domain.GM;
import com.example._12.domain.Student;
import com.example._12.domain.logindata;
import com.example._12.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RestController
public class LoginServlet {

    @Autowired
    LoginService loginService;

    @GetMapping("/GMlogin")
    public String GMlogin(@RequestParam("username") String username, @RequestParam("password") String password) {
        List<GM> GM = loginService.selectGM();

        for (GM x : GM) {
            if (username.equals(x.getUsername()) && password.equals(x.getPassword())) {

                return "success";
            }
        }
        return "fail";
    }

    @GetMapping("/CoachLogin")
    public String Coachlogin(@RequestParam("username") String username, @RequestParam("password") String password,
                             HttpServletResponse response) {


        List<CoachUser> GM = loginService.selectCoachLogin();

        for (CoachUser x : GM) {
            if (username.equals(x.getUsername()) && password.equals(x.getPassword())) {
                Cookie c1 =new Cookie("coachname",x.getName());
                response.addCookie(c1);
                return "success";
            }
        }
        return "fail";
    }


    @GetMapping("/login")
    public String Normallogin(@RequestParam("username") String username, @RequestParam("password") String password ,
                              @RequestParam("radio")String radio,HttpServletResponse response) {

        List<logindata> user = loginService.selectLogin();
        for (logindata x : user) {
            if (username.equals(x.getUsername()) && password.equals(x.getPassword()) && radio.equals(x.getType())) {
                Student stu;
                if("1".equals(radio)) {
                    stu = loginService.selectStudentByNum(username);
                }
                else if("2".equals(radio)){
                    stu = loginService.selectTeacherByNum(username);
                }else {
                    stu = loginService.selectNormalByNum(username);
                }
                Cookie c1 = new Cookie("num",Integer.toString(stu.getNum()));
                Cookie c2 = new Cookie("name",stu.getName());
                Cookie c3 = new Cookie("sex",stu.getSex());
                Cookie c4 = new Cookie("age",Integer.toString(stu.getAge()));
                Cookie c5 = new Cookie("id",stu.getId());
                Cookie c6 = new Cookie("radio",radio);
                Cookie c7 = new Cookie("username",username);
                response.addCookie(c1);
                response.addCookie(c2);
                response.addCookie(c3);
                response.addCookie(c4);
                response.addCookie(c5);
                response.addCookie(c6);
                response.addCookie(c7);
                return "success";
            }
        }
        return "fail";
    }
}
