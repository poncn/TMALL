package com.poncn.dao;

import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.poncn.entity.ProductImage;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductImageDao {

    int insert(@Param("pojo") ProductImage pojo);

    int insertList(@Param("pojos") List< ProductImage> pojo);

    List<ProductImage> select(@Param("pojo") ProductImage pojo);

    int update(@Param("pojo") ProductImage pojo);

}
