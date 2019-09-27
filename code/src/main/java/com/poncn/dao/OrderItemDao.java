package com.poncn.dao;

import com.poncn.entity.OrderItem;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderItemDao {

    int insert(@Param("pojo") OrderItem pojo);

    int insertList(@Param("pojos") List< OrderItem> pojo);

    List<OrderItem> select(@Param("pojo") OrderItem pojo);

    List<OrderItem> queryByUid(@Param("uid") long uid);

    List<OrderItem> queryByCart(@Param("uid") long uid);

    int update(@Param("pojo") OrderItem pojo);

}
