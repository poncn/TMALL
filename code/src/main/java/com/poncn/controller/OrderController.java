package com.poncn.controller;

import com.poncn.entity.Order;
import com.poncn.entity.PageBean;
import com.poncn.service.OrderService;
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
public class OrderController {
    @Resource
    private OrderService orderService;

    @RequestMapping("/listOrder")
    public String listOrder(@RequestParam(defaultValue = "1", value = "page", required = true) String pageNumber, Map<String, Object> map) {
        PageBean<Order> pageBean = orderService.select(Integer.parseInt(pageNumber), 7);
        map.put("pageBean", pageBean);
        return "/admin/listOrder";
    }

}
