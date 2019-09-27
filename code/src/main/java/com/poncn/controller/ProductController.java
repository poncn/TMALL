package com.poncn.controller;

import com.poncn.entity.PageBean;
import com.poncn.entity.Product;
import com.poncn.entity.PropertyValue;
import com.poncn.entity.Review;
import com.poncn.service.ProductService;
import com.poncn.service.PropertyValueService;
import com.poncn.service.ReviewService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author pency gui
 * @version version 1.0
 * @date 2019/9/24 0024
 */
@Controller
@RequestMapping("/product")
public class ProductController {
    @Resource
    private ProductService productService;

    @Resource
    private ReviewService reviewService;

    @Resource
    private PropertyValueService propertyValueService;

    @RequestMapping("/adminProductList")
    public String adminProductList(@RequestParam(defaultValue = "1", value = "page", required = true) String pageNumber, @RequestParam(defaultValue = "1", value = "cid", required = true) String cid, Map<String, Object> map) {
        PageBean<Product> pageBean = productService.select(Integer.parseInt(pageNumber), 7, Integer.parseInt(cid));
        map.put("pageBean", pageBean);
        return "/admin/listProduct";
    }

    @RequestMapping("/foreproduct")
    public String foreproduct(@RequestParam(defaultValue = "1", value = "pid", required = true) String pid, Map<String, Object> map) {
        List<Review> reviews = reviewService.queryByPid(Long.parseLong(pid));
        List<PropertyValue> pvs = propertyValueService.queryByPid(Long.parseLong(pid));
        Product p = productService.queryById(Long.parseLong(pid));
        p.setReviewCount(reviews.size());
        map.put("reviews", reviews);
        map.put("pvs", pvs);
        map.put("p", p);
        return "/fore/product";
    }
}
