package com.poncn.service;

import com.poncn.dao.ReviewDao;
import com.poncn.entity.Review;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ReviewService {

    @Resource
    private ReviewDao reviewDao;

    public int insert(Review pojo){
        return reviewDao.insert(pojo);
    }

    public int insertList(List< Review> pojos){
        return reviewDao.insertList(pojos);
    }

    public List<Review> select(Review pojo){
        return reviewDao.select(pojo);
    }

    public List<Review> queryByPid(long pid) {
        return reviewDao.queryByPid(pid);
    }

    public int update(Review pojo){
        return reviewDao.update(pojo);
    }

}
