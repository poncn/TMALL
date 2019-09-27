package com.poncn.dao;

import com.poncn.entity.ProductImage;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductImageDao {

    int insert(@Param("pojo") ProductImage pojo);

    int insertList(@Param("pojos") List< ProductImage> pojo);

    List<ProductImage> select(@Param("pojo") ProductImage pojo);

    int update(@Param("pojo") ProductImage pojo);

    long queryByPid(@Param("pid") long pid);
}
