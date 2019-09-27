package com.poncn.dao;

import com.poncn.entity.PageBean;
import com.poncn.entity.Property;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PropertyDao {

    int insert(@Param("pojo") Property pojo);

    int insertList(@Param("pojos") List< Property> pojo);

    int getTotals();

    List<Property> select(@Param("pageBean") PageBean pageBean);

    int update(@Param("pojo") Property pojo);

}
