package com.example._12.Controller;

import com.example._12.domain.PageBean;
import com.example._12.domain.Student;
import com.example._12.service.StudentService;
import com.example._12.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/teacher")
public class TeacherServlet {
    @Autowired
    TeacherService studentService;

    @PostMapping("/selectAll")
    public PageBean<Student> selectAll(@RequestParam("currentPage") int currentPage,
                                       @RequestParam("pageSize") int pageSize, @RequestBody Student stu) {
        return studentService.selectByPageAndContion(currentPage, pageSize, stu);
    }

    @PostMapping("/add")
    public String add(@RequestBody Student stu){
        studentService.add(stu);
        return "success";
    }

    @DeleteMapping("/deleteByIds")
    public String deleteByIds(@RequestBody int[] ids) {
        studentService.deleteByIds(ids);
        return "success";
    }

    @PutMapping("/updateByNum")
    public String updateByNum(@RequestBody Student stu){
        studentService.updateByNum(stu);
        return "success";
    }


    @DeleteMapping("/deleteByNum")
    public String deleteByNum(@RequestBody String id) {
        studentService.deleteById(Integer.parseInt(id));
        return "success";
    }
}
