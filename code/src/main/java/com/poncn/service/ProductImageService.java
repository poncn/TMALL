package com.poncn.service;

import com.poncn.dao.ProductImageDao;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.poncn.entity.ProductImage;

@Service
public class ProductImageService {

    @Resource
    private ProductImageDao productImageDao;

    public int insert(ProductImage pojo){
        return productImageDao.insert(pojo);
    }

    public int insertList(List< ProductImage> pojos){
        return productImageDao.insertList(pojos);
    }

    public List<ProductImage> select(ProductImage pojo){
        return productImageDao.select(pojo);
    }

    public int update(ProductImage pojo){
        return productImageDao.update(pojo);
    }

}
