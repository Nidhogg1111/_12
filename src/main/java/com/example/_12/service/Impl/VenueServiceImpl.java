package com.example._12.service.Impl;


import com.example._12.dao.VenueDao;
import com.example._12.domain.PageBean;
import com.example._12.domain.venue;
import com.example._12.service.VenueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VenueServiceImpl implements VenueService {

    @Autowired
    VenueDao venueDao;

    public PageBean<venue> selectVenueByPageAndContion(int currentage, int pageSize,  venue ven) {
        int begin = (currentage - 1) * pageSize;

        //处理student条件 进行模糊查询
        String coach = ven.getCoach();
        if (coach != null && coach.length() > 0) {
            ven.setCoach("%" + coach + "%");
        }

        List<venue> stu = venueDao.selectVenueByPageAndContion(begin, pageSize, ven);
        int total = venueDao.selectVenueTotalCountByContion(ven);
        //封装PageBean对象
        PageBean<venue> pageBean = new PageBean<venue>();
        pageBean.setRows(stu);
        pageBean.setTotalCount(total);
        return pageBean;
    }

    public void deleteVenueByIds(int[] ids){
        venueDao.deleteVenueByIds(ids);
    }


    public void updateVenue(venue ven){
        venueDao.updateVenue(ven);
    }

    public void deleteVenue(venue ven){
        venueDao.deleteVenue(ven);
    }
}
