package com.example._12.service.Impl;

import com.example._12.dao.CancelDao;
import com.example._12.domain.PageBean;
import com.example._12.domain.Record;
import com.example._12.domain.venue;
import com.example._12.service.CancelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CancelServiceImpl implements CancelService {
    @Autowired
    CancelDao cancelDao;
   public PageBean<Record> selectCancelByPageAndContion(int currentage, int pageSize, Record rec){
        int begin = (currentage - 1) * pageSize;

        //处理student条件 进行模糊查询
        String coach = rec.getCoach();
        if (coach != null && coach.length() > 0) {
            rec.setCoach("%" + coach + "%");
        }

        List<Record> stu = cancelDao.selectCancelByPageAndContion(begin, pageSize, rec);
        int total = cancelDao.selectCancelTotalCountByContion(rec);
        //封装PageBean对象
        PageBean<Record> pageBean = new PageBean<Record>();
        pageBean.setRows(stu);
        pageBean.setTotalCount(total);
        return pageBean;
    }

    ;


    public void cancelRecord(Record rec){
        cancelDao.cancelRecord(rec);
    };
}
