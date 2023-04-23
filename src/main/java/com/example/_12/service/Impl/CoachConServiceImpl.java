package com.example._12.service.Impl;

import com.example._12.dao.CoachConDao;
import com.example._12.domain.PageBean;
import com.example._12.domain.Record;
import com.example._12.domain.Student;
import com.example._12.service.CoachConService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CoachConServiceImpl implements CoachConService {
    @Autowired
    CoachConDao coachConDao;

    public PageBean<Record> selectCancelByPageAndContion(int currentage, int pageSize, Record rec){
        int begin = (currentage - 1) * pageSize;

        //处理student条件 进行模糊查询
        String xuehao = rec.getXuehao();
        if (xuehao != null && xuehao.length() > 0) {
            rec.setCoach("%" + xuehao + "%");
        }

        List<Record> stu = coachConDao.selectCancelByPageAndContion(begin, pageSize, rec);
        int total = coachConDao.selectCancelTotalCountByContion(rec);
        //封装PageBean对象
        PageBean<Record> pageBean = new PageBean<Record>();
        pageBean.setRows(stu);
        pageBean.setTotalCount(total);
        return pageBean;
    };

}
