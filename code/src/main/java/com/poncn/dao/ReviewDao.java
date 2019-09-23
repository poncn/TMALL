package com.poncn.dao;

import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.poncn.entity.Review;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewDao {

    int insert(@Param("pojo") Review pojo);

    int insertList(@Param("pojos") List< Review> pojo);

    List<Review> select(@Param("pojo") Review pojo);

    int update(@Param("pojo") Review pojo);

}
