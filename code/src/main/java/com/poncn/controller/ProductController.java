package com.poncn.controller;

import com.poncn.entity.*;
import com.poncn.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
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
    private OrderItemService orderItemService;

    @Resource
    private PropertyValueService propertyValueService;

    @Resource
    private UserService userService;

    @RequestMapping("/adminProductList")
    public String adminProductList(@RequestParam(defaultValue = "1", value = "page", required = true) String pageNumber, @RequestParam(defaultValue = "1", value = "cid", required = true) String cid, Map<String, Object> map) {
        PageBean<Product> pageBean = productService.select(Integer.parseInt(pageNumber), 7, Integer.parseInt(cid));
        map.put("pageBean", pageBean);
        return "/admin/listProduct";
    }


    @RequestMapping("/foreproduct")
    public String foreproduct(@RequestParam(defaultValue = "", value = "pid", required = true) String pid, Map<String, Object> map) {
        List<Review> reviews = reviewService.queryByPid(Long.parseLong(pid));
        List<PropertyValue> pvs = propertyValueService.queryByPid(Long.parseLong(pid));
        Product p = productService.queryById(Long.parseLong(pid));
        p.setReviewCount(reviews.size());
        for (Review review : reviews) {
            String name = review.getUser().getName();
            char start = name.charAt(0);
            char end = name.charAt(name.length() - 1);
            String newName = start + "****" + end;
            review.getUser().setName(newName);
        }
        map.put("reviews", reviews);
        map.put("pvs", pvs);
        map.put("p", p);
        return "/fore/product";
    }

    @ResponseBody
    @RequestMapping("/forecheckLogin")
    public String forecheckLogin(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
        try {
            HttpSession session = request.getSession();
            User user = (User) session.getAttribute("user");
            if (user != null) {
                return "success";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "error";
    }

    @ResponseBody
    @RequestMapping("/foreloginAjax")
    public String foreloginAjax(@RequestParam(name = "name", required = true, defaultValue = "") String name, @RequestParam(name = "password", required = true, defaultValue = "") String password, Map<String, String> map, HttpServletResponse response, HttpSession session) {
        User user = new User();
        user.setName(name);
        user.setPassword(password);
        if ((user = userService.queryByName(user)) != null) {
            session.setAttribute("user", user);
            return "success";
        }
        return "error";
    }

    @ResponseBody
    @RequestMapping("/foreaddCart")
    public String foreaddCart(@RequestParam(name = "pid", required = true, defaultValue = "") String pid, @RequestParam(name = "number", required = true, defaultValue = "") String number, Map<String, Object> map, HttpServletRequest request) {
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        OrderItem orderItem = new OrderItem();
        orderItem.setUid(user.getId());
        orderItem.setNumber(Long.parseLong(number));
        orderItem.setPid(Long.parseLong(pid));
        int i = orderItemService.insert(orderItem);
        if (i > 0) {
            return "success";
        }
        return "error";
    }

    @RequestMapping("/forebuyone")
    public String forebuyone(@RequestParam(name = "pid", required = true, defaultValue = "") String pid, @RequestParam(name = "num", required = true, defaultValue = "") String number, Map<String, Object> map) {
        Product product = productService.queryById(Long.parseLong(pid));
        map.put("product", product);
        map.put("number", number);
        return "/fore/buy";
    }
}
