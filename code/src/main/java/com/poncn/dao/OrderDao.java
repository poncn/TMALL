package com.poncn.dao;

import com.poncn.entity.Order;
import com.poncn.entity.PageBean;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderDao {

    int insert(@Param("pojo") Order pojo);

    int insertList(@Param("pojos") List< Order> pojo);

    int getTotals();

    List<Order> select(@Param("pageBean") PageBean pageBean);

    int update(@Param("pojo") Order pojo);

    Order queryById(@Param("id") long id);

}
