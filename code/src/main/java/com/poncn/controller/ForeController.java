package com.poncn.controller;

import com.poncn.entity.Category;
import com.poncn.entity.Product;
import com.poncn.service.CategoryService;
import com.poncn.service.ProductImageService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Controller
public class ForeController {

    @Resource
    private CategoryService categoryService;
    @Resource
    private ProductImageService productImageService;

    @RequestMapping("/index")
    public String index(Map<String, Object> map) {
        List<Category> cs = categoryService.queryCategoryProduct();
        long categorycount = categoryService.queryCount();
        for (Category c : cs) {
            for (Product p : c.getProducts()) {
                long productImg = productImageService.queryByPid(p.getId());
                p.setProductImg(productImg);
            }
        }
        map.put("cs", cs);
        map.put("categorycount", categorycount);
        return "/fore/home";
    }


}
