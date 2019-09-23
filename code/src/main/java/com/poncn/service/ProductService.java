package com.poncn.service;

import com.poncn.dao.ProductDao;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.poncn.entity.Product;

@Service
public class ProductService {

    @Resource
    private ProductDao productDao;

    public int insert(Product pojo){
        return productDao.insert(pojo);
    }

    public int insertList(List< Product> pojos){
        return productDao.insertList(pojos);
    }

    public List<Product> select(Product pojo){
        return productDao.select(pojo);
    }

    public int update(Product pojo){
        return productDao.update(pojo);
    }

}
