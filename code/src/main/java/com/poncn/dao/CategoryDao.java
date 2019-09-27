package com.poncn.dao;

import com.poncn.entity.Category;
import com.poncn.entity.PageBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CategoryDao {

    int insert(@Param("pojo") Category pojo);

    int getCounts();

    List<Category> select(@Param("pageBean") PageBean pageBean);

    List<Category> queryCategoryProduct();

    long queryCount();

    int update(@Param("pojo") Category pojo);

}
