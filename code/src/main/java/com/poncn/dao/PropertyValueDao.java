package com.poncn.dao;

import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.poncn.entity.PropertyValue;
import org.springframework.stereotype.Repository;

@Repository
public interface PropertyValueDao {

    int insert(@Param("pojo") PropertyValue pojo);

    int insertList(@Param("pojos") List< PropertyValue> pojo);

    List<PropertyValue> select(@Param("pojo") PropertyValue pojo);

    int update(@Param("pojo") PropertyValue pojo);

}
