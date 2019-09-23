package com.poncn.service;

import com.poncn.dao.PropertyValueDao;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.poncn.entity.PropertyValue;

@Service
public class PropertyValueService {

    @Resource
    private PropertyValueDao propertyValueDao;

    public int insert(PropertyValue pojo){
        return propertyValueDao.insert(pojo);
    }

    public int insertList(List< PropertyValue> pojos){
        return propertyValueDao.insertList(pojos);
    }

    public List<PropertyValue> select(PropertyValue pojo){
        return propertyValueDao.select(pojo);
    }

    public int update(PropertyValue pojo){
        return propertyValueDao.update(pojo);
    }

}
