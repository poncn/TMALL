package com.poncn.dao;

import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.poncn.entity.Property;
import org.springframework.stereotype.Repository;

@Repository
public interface PropertyDao {

    int insert(@Param("pojo") Property pojo);

    int insertList(@Param("pojos") List< Property> pojo);

    List<Property> select(@Param("pojo") Property pojo);

    int update(@Param("pojo") Property pojo);

}
