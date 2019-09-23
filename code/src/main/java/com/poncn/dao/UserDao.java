package com.poncn.dao;

import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.poncn.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {

    int insert(@Param("pojo") User pojo);

    int insertList(@Param("pojos") List< User> pojo);

    List<User> select(@Param("pojo") User pojo);

    int update(@Param("pojo") User pojo);

    int login(@Param("pojo") User pojo);

    int loginOut(@Param("pojo") User pojo);
}
