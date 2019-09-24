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

    public int insertList(List< Category> pojos){
        return categoryDao.insertList(pojos);
    }

    public int getTotals(){
        return categoryDao.getTotals();
    }

    public PageBean<Category> select(int pageNumber,int pageSize){
        PageBean<Category> pageBean = new PageBean<Category>(pageNumber, pageSize);
        pageBean.setPageCount(categoryDao.getTotals());
        List<Category> list=categoryDao.select(pageBean);
        pageBean.setList(list);
        return pageBean;
    }

    public int update(Category pojo){
        return categoryDao.update(pojo);
    }

}
