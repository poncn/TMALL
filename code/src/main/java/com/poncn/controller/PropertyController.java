package com.poncn.controller;

import com.poncn.entity.PageBean;
import com.poncn.entity.Property;
import com.poncn.service.PropertyService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @author pency gui
 * @version version 1.0
 * @date 2019/9/24 0024
 */
@Controller
public class PropertyController {
    @Resource
    private PropertyService propertyService;

    @RequestMapping("/adminPropertyList")
    public String adminPropertyList(@RequestParam(defaultValue = "1", value = "page", required = true) String pageNumber, @RequestParam(defaultValue = "1", value = "cid", required = true) String cid, Map<String, Object> map) {
        PageBean<Property> pageBean = propertyService.select(Integer.parseInt(pageNumber), 7, Integer.parseInt(cid));
        map.put("pageBean", pageBean);
        return "/admin/listProperty";
    }

}
