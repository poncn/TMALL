package com.poncn.dao;

import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.poncn.entity.Order;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDao {

    int insert(@Param("pojo") Order pojo);

    int insertList(@Param("pojos") List< Order> pojo);

    List<Order> select(@Param("pojo") Order pojo);

    int update(@Param("pojo") Order pojo);

}
