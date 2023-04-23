package com.example._12;

import com.example._12.Controller.StudentServlet;
import com.example._12.Controller.bookServlet;
import com.example._12.domain.PageBean;
import com.example._12.domain.Record;
import com.example._12.domain.venue;
import com.example._12.service.bookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.servlet.ServletException;
import java.io.IOException;

@SpringBootTest
class ApplicationTests {

    @Autowired
    private bookService bookservice;

    @Autowired
    private bookServlet bookservlet;

    @Autowired
    private StudentServlet studentServlet;
    @Test
    void contextLoads() throws ServletException, IOException {

    }

}
