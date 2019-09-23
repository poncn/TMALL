package com.poncn.dao;

import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.poncn.entity.OrderItem;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemDao {

    int insert(@Param("pojo") OrderItem pojo);

    int insertList(@Param("pojos") List< OrderItem> pojo);

    List<OrderItem> select(@Param("pojo") OrderItem pojo);

    int update(@Param("pojo") OrderItem pojo);

}
