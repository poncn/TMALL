package com.poncn.dao;

import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.poncn.entity.Product;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDao {

    int insert(@Param("pojo") Product pojo);

    int insertList(@Param("pojos") List< Product> pojo);

    List<Product> select(@Param("pojo") Product pojo);

    int update(@Param("pojo") Product pojo);

}
