package com.poncn.dao;

import com.poncn.entity.PropertyValue;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PropertyValueDao {

    int insert(@Param("pojo") PropertyValue pojo);

    int insertList(@Param("pojos") List< PropertyValue> pojo);

    List<PropertyValue> select(@Param("pojo") PropertyValue pojo);

    int update(@Param("pojo") PropertyValue pojo);

    List<PropertyValue> queryByPid(@Param("pid") long pid);
}
