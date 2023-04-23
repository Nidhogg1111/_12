package com.example._12.Controller;

import com.example._12.Utils.CookieUtils;
import com.example._12.domain.PageBean;
import com.example._12.domain.Record;
import com.example._12.domain.Student;
import com.example._12.domain.venue;
import com.example._12.service.bookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/book")
public class bookServlet {
    @Autowired
    private bookService bookservice;



    @PostMapping("/selectAll")
    public PageBean<venue> selectAll(@RequestParam("currentPage") int currentPage,
                                     @RequestParam("pageSize") int pageSize, @RequestBody venue stu) {
        PageBean<venue> pageBean = bookservice.selectVenueByPageAndContion(currentPage, pageSize, stu);
        return pageBean;
    }

    @GetMapping("/getCookie")
    public Student getCookie(HttpServletRequest request){
        Student stu =new Student();
        Cookie[] cookies=request.getCookies();
        stu.setName(CookieUtils.getCookie(cookies,"name").getValue());
        stu.setNum(Integer.parseInt(CookieUtils.getCookie(cookies,"num").getValue()));
        stu.setSex(CookieUtils.getCookie(cookies,"sex").getValue());
        stu.setId(CookieUtils.getCookie(cookies,"id").getValue());
        stu.setAge(Integer.parseInt(CookieUtils.getCookie(cookies,"age").getValue()));
        return stu;
    }




    @PostMapping("/record")
    public String record(@RequestBody Record stu) throws ServletException, IOException {
        List<Record> rec = bookservice.selectRecord();

        int statement = 1;
        for (Record i : rec) {
            if (i.getCoach().equals(stu.getCoach()) && i.getId().equals(stu.getId())
                    && i.getTime().equals(stu.getTime()) && i.getXuehao().equals(stu.getXuehao())) {
                statement = 0;
                break;
            }
        }
        if (statement == 1) {
            bookservice.addRecord(stu);
            return "success";
        } else {
            return "warn";
       }
    }
}
