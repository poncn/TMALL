package com.poncn.service;

import com.poncn.dao.PropertyDao;
import com.poncn.entity.PageBean;
import com.poncn.entity.Property;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PropertyService {

    @Resource
    private PropertyDao propertyDao;

    public int insert(Property pojo){
        return propertyDao.insert(pojo);
    }

    public int insertList(List< Property> pojos){
        return propertyDao.insertList(pojos);
    }

    public int getTotals() {
        return propertyDao.getTotals();
    }

    public PageBean<Property> select(int pageNumber, int pageSize, int cid) {
        PageBean<Property> pageBean = new PageBean<Property>(pageNumber, pageSize);
        Property property = new Property();
        property.setCid(cid);
        pageBean.setT(property);
        pageBean.setPageCount(propertyDao.getTotals());
        List<Property> list = propertyDao.select(pageBean);
        pageBean.setList(list);
        return pageBean;
    }
    public int update(Property pojo){
        return propertyDao.update(pojo);
    }

}
