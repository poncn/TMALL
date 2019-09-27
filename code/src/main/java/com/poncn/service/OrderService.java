package com.poncn.service;

import com.poncn.dao.OrderDao;
import com.poncn.entity.Order;
import com.poncn.entity.PageBean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

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

    public int getTotals() {
        return orderDao.getTotals();
    }

    public PageBean<Order> select(int pageNumber, int pageSize) {
        PageBean<Order> pageBean = new PageBean<Order>(pageNumber, pageSize);
        pageBean.setPageCount(orderDao.getTotals());
        List<Order> list = orderDao.select(pageBean);
        pageBean.setList(list);
        return pageBean;
    }
    public int update(Order pojo){
        return orderDao.update(pojo);
    }
}
