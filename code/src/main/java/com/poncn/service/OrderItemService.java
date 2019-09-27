package com.poncn.service;

import com.poncn.dao.OrderItemDao;
import com.poncn.entity.OrderItem;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OrderItemService {
    @Resource
    private OrderItemDao orderItemDao;

    public int insert(OrderItem pojo){
        return orderItemDao.insert(pojo);
    }

    public int insertList(List< OrderItem> pojos){
        return orderItemDao.insertList(pojos);
    }

    public List<OrderItem> select(OrderItem pojo){
        return orderItemDao.select(pojo);
    }

    public List<OrderItem> queryByUid(long id) {
        return orderItemDao.queryByUid(id);
    }

    public List<OrderItem> queryByCart(long id) {
        return orderItemDao.queryByCart(id);
    }

    public int update(OrderItem pojo){

        return orderItemDao.update(pojo);
    }

}
