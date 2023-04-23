package com.example._12.Controller;

import com.example._12.domain.PageBean;
import com.example._12.domain.Student;
import com.example._12.domain.venue;
import com.example._12.service.VenueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;


@RestController
@RequestMapping("/venue")
public class VenueServlet {

    @Autowired
    VenueService venueService;

    @PostMapping("/selectAll")
    public PageBean<venue> selectAll(@RequestParam("currentPage") int currentPage,
                                       @RequestParam("pageSize") int pageSize, @RequestBody venue stu) {
        return venueService.selectVenueByPageAndContion(currentPage, pageSize, stu);
    }


    @DeleteMapping("/deleteByIds")
    public String deleteByIds(@RequestBody int[] ids) {
        venueService.deleteVenueByIds(ids);
        return "success";
    }

    @PutMapping("/updateByNum")
    public String updateByNum(@RequestBody venue stu){
        venueService.updateVenue(stu);
        return "success";
    }


    @DeleteMapping("/deleteByNum")
    public String deleteByNum(@RequestBody venue ven) {
        venueService.deleteVenue(ven);
        return "success";
    }

}
