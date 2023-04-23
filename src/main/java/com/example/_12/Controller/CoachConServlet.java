package com.example._12.Controller;

import com.example._12.Utils.CookieUtils;
import com.example._12.domain.CoachUser;
import com.example._12.domain.PageBean;
import com.example._12.domain.Record;
import com.example._12.domain.Student;
import com.example._12.service.CancelService;
import com.example._12.service.CoachConService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/coachcon")
public class CoachConServlet {

    @Autowired
    CoachConService cancelService;

    @PostMapping("/selectAll")
    public PageBean<Record> selectAll(@RequestParam("currentPage") int currentPage,
                                      @RequestParam("pageSize") int pageSize, @RequestBody Record rec){
        System.out.println(rec);
        return cancelService.selectCancelByPageAndContion(currentPage, pageSize, rec);
    }

    @GetMapping("/getCookie")
    public CoachUser getCookie(HttpServletRequest request){
        CoachUser stu =new CoachUser();
        Cookie[] cookies=request.getCookies();
        stu.setName(CookieUtils.getCookie(cookies,"coachname").getValue());
        return stu;
    }

}
