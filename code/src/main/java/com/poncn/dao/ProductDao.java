package com.poncn.dao;

import com.poncn.entity.PageBean;
import com.poncn.entity.Product;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductDao {
    int insert(@Param("pojo") Product pojo);

    int insertList(@Param("pojos") List< Product> pojo);

    int getTotals();

    List<Product> select(@Param("pageBean") PageBean pageBean);

    Product queryById(@Param("id") long id);

    int update(@Param("pojo") Product pojo);
}
