package com.poncn.service;

import com.poncn.dao.ProductDao;
import com.poncn.entity.PageBean;
import com.poncn.entity.Product;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

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

    public int getTotals() {
        return productDao.getTotals();
    }

    public PageBean<Product> select(int pageNumber, int pageSize, int cid) {
        PageBean<Product> pageBean = new PageBean<Product>(pageNumber, pageSize);
        Product product = new Product();
        product.setCid(cid);
        pageBean.setT(product);
        pageBean.setPageCount(productDao.getTotals());
        List<Product> list = productDao.select(pageBean);
        pageBean.setList(list);
        return pageBean;
    }

    public Product queryById(long id) {
        return productDao.queryById(id);
    }

    public int update(Product pojo){
        return productDao.update(pojo);
    }

}
