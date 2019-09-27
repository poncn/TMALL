package com.poncn.dao;

import com.poncn.entity.PageBean;
import com.poncn.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {

    int insert(@Param("pojo") User pojo);

    int insertList(@Param("pojos") List< User> pojo);

    int getTotals();

    List<User> select(@Param("pageBean") PageBean pageBean);

    int update(@Param("pojo") User pojo);

    User queryByName(@Param("pojo") User pojo);
}
