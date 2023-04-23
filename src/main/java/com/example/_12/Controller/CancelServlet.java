package com.example._12.Controller;

import com.example._12.domain.PageBean;
import com.example._12.domain.Record;
import com.example._12.service.CancelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Cancel")
public class CancelServlet{
    @Autowired
    CancelService cancelService;

    @PostMapping("/selectAll")
    public PageBean<Record> selectAll(@RequestParam("currentPage") int currentPage,
                          @RequestParam("pageSize") int pageSize, @RequestBody Record rec){

        return cancelService.selectCancelByPageAndContion(currentPage, pageSize, rec);
    }

    @DeleteMapping("/cancelRecord")
    public String  cancelRecord(@RequestBody Record rec) {
        //接收品牌数据
        System.out.println(rec);
        cancelService.cancelRecord(rec);
        return "success";
    }
}
