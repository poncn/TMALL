package com.poncn.controller;

import com.poncn.entity.Category;
import com.poncn.entity.PageBean;
import com.poncn.service.CategoryService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @author pency gui
 * @version version 1.0
 * @date 2019/9/23 0023
 */

@Controller
public class AdminController {

    @Resource
    private CategoryService categoryService;

    @RequestMapping("/admin")
    public String admin(Map<String, Object> map) {
        PageBean<Category> pageBean = categoryService.select(1, 7);
        map.put("pageBean", pageBean);
        return "/admin/listCategory";
    }
    @RequestMapping("/admin/{pageNumber}")
    public String admin(@PathVariable String pageNumber, Map<String, Object> map) {
        PageBean<Category> pageBean = categoryService.select(Integer.parseInt(pageNumber), 7);
        map.put("pageBean", pageBean);
        return "/admin/listCategory";
    }


}
