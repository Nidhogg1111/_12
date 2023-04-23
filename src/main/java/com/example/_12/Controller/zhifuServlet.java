package com.example._12.Controller;

import com.example._12.domain.Record;
import com.example._12.service.zhifuService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class zhifuServlet {

    @Autowired
    zhifuService zhifuservice;
    @GetMapping("/zhifu")
    int selectTotalCount(@RequestParam String xuehao){
        return zhifuservice.selectTotalCount((xuehao));
    };
}
