package com.poncn.service;

import com.poncn.dao.CategoryDao;
import com.poncn.entity.Category;
import com.poncn.entity.PageBean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CategoryService {

    @Resource
    private CategoryDao categoryDao;

    public int insert(Category pojo){
        return categoryDao.insert(pojo);
    }

    public PageBean<Category> select(int pageNumber,int pageSize){
        PageBean<Category> pageBean = new PageBean<Category>(pageNumber, pageSize);
        pageBean.setPageCount(categoryDao.getCounts());
        List<Category> list=categoryDao.select(pageBean);
        pageBean.setList(list);
        return pageBean;
    }

    public List<Category> queryCategoryProduct() {
        return categoryDao.queryCategoryProduct();
    }

    public long queryCount() {
        return categoryDao.queryCount();
    }

    public int update(Category pojo){
        return categoryDao.update(pojo);
    }

}
