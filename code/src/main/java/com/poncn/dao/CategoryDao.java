package com.poncn.dao;

import com.poncn.entity.PageBean;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.poncn.entity.Category;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryDao {

    int insert(@Param("pojo") Category pojo);

    int insertList(@Param("pojos") List< Category> pojo);

    int getTotals();

    List<Category> select(@Param("pageBean") PageBean pageBean);

    int update(@Param("pojo") Category pojo);

}
