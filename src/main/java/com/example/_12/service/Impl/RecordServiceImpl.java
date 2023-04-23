package com.example._12.service.Impl;

import com.example._12.dao.RecordDao;
import com.example._12.domain.PageBean;
import com.example._12.domain.Record;
import com.example._12.domain.Student;
import com.example._12.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecordServiceImpl implements RecordService {

    @Autowired
    RecordDao recordDao;
    @Override
    public PageBean<Record> selectCancelByPageAndContion(int currentage, int pageSize, Record rec) {
        int begin = (currentage - 1) * pageSize;

        //处理student条件 进行模糊查询
        String coach = rec.getCoach();
        if (coach != null && coach.length() > 0) {
            rec.setCoach("%" + coach + "%");
        }
        String xuehao = rec.getXuehao();
        if (xuehao != null && xuehao.length() > 0) {
            rec.setXuehao("%" + xuehao + "%");
        }

        List<Record> stu = recordDao.selectCancelByPageAndContion(begin, pageSize, rec);
        int total = recordDao.selectCancelTotalCountByContion(rec);
        //封装PageBean对象
        PageBean<Record> pageBean = new PageBean<Record>();
        pageBean.setRows(stu);
        pageBean.setTotalCount(total);
        return pageBean;
    }

    @Override
    public void addRecord(Record rec) {
        recordDao.addRecord(rec);
    }

    @Override
    public void deleteRecordByIds(int[] ids) {
        recordDao.deleteRecordByIds(ids);
    }

    @Override
    public void deleteRecordById(int num) {
        recordDao.deleteRecordById(num);
    }
}
