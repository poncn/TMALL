package com.poncn.service;

import com.poncn.dao.UserDao;
import com.poncn.entity.PageBean;
import com.poncn.entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {

    @Resource
    private UserDao userDao;

    public int insert(User pojo){
        return userDao.insert(pojo);
    }

    public int insertList(List< User> pojos){
        return userDao.insertList(pojos);
    }

    public int getTotals() {
        return userDao.getTotals();
    }

    public PageBean<User> select(int pageNumber, int pageSize) {
        PageBean<User> pageBean = new PageBean<User>(pageNumber, pageSize);
        pageBean.setPageCount(userDao.getTotals());
        List<User> list = userDao.select(pageBean);
        pageBean.setList(list);
        return pageBean;
    }

    public int update(User pojo){
        return userDao.update(pojo);
    }

}
