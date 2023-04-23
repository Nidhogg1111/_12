package com.example._12.service.Impl;

import com.example._12.dao.bookDao;
import com.example._12.domain.PageBean;
import com.example._12.domain.Record;
import com.example._12.domain.venue;
import com.example._12.service.bookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class bookServiceImpl implements bookService {
    @Autowired
    private bookDao bookdao;


    public void addRecord(Record rec){
        bookdao.addRecord(rec);
    }

    public PageBean<venue> selectVenueByPageAndContion(int currentage, int pageSize, venue ven){

        int begin = (currentage - 1) * pageSize;
        //处理student条件 进行模糊查询
        String coach = ven.getCoach();
        if (coach != null && coach.length() > 0) {
            ven.setCoach("%" + coach + "%");
        }
        List<venue> stu =  bookdao.selectVenueByPageAndContion(begin, pageSize, ven);
        int total =   bookdao.selectVenueTotalCountByContion(ven);
        //封装PageBean对象

        PageBean<venue> pageBean = new PageBean<venue>();
        pageBean.setRows(stu);
        pageBean.setTotalCount(total);
        return pageBean;
    }

    @Override
    public List<Record> selectRecord() {
        return bookdao.selectRecord();
    }
}
