package com.example._12.Controller;

import com.example._12.domain.PageBean;
import com.example._12.domain.Record;
import com.example._12.domain.Student;
import com.example._12.service.NormalService;
import com.example._12.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;

@RestController
@RequestMapping("/recordcon")
public class RecordServlet {
    @Autowired
    RecordService studentService;

    @PostMapping("/selectAll")
    public PageBean<Record> selectAll(@RequestParam("currentPage") int currentPage,
                                       @RequestParam("pageSize") int pageSize, @RequestBody Record rec) {
        return studentService.selectCancelByPageAndContion(currentPage, pageSize, rec);
    }

    @PostMapping("/add")
    public String add(@RequestBody Record stu){
        studentService.addRecord(stu);
        return "success";
    }

    @DeleteMapping("/deleteByIds")
    public String deleteByIds(@RequestBody int[] ids) {
        studentService.deleteRecordByIds(ids);
        return "success";
    }


    @DeleteMapping("/deleteByNum")
    public String deleteByNum(@RequestBody String id) {
        studentService.deleteRecordById(Integer.parseInt(id));
        return "success";
    }
}
