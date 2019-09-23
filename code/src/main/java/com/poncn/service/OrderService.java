package com.poncn.service;

import com.poncn.dao.OrderDao;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.poncn.entity.Order;

@Service
public class OrderService {

    @Resource
    private OrderDao orderDao;

    public int insert(Order pojo){
        return orderDao.insert(pojo);
    }

    public int insertList(List< Order> pojos){
        return orderDao.insertList(pojos);
    }

    public List<Order> select(Order pojo){
        return orderDao.select(pojo);
    }

    public int update(Order pojo){
        return orderDao.update(pojo);
    }

}
