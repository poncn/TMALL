package com.poncn.service;

import com.poncn.dao.PropertyDao;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.poncn.entity.Property;

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

    public List<Property> select(Property pojo){
        return propertyDao.select(pojo);
    }

    public int update(Property pojo){
        return propertyDao.update(pojo);
    }

}
