package com.poncn.dao;

import com.poncn.entity.Review;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewDao {

    int insert(@Param("pojo") Review pojo);

    int insertList(@Param("pojos") List< Review> pojo);

    List<Review> select(@Param("pojo") Review pojo);

    int update(@Param("pojo") Review pojo);

    List<Review> queryByPid(@Param("pid") long pid);
}
