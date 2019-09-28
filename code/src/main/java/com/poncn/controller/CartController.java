package com.poncn.controller;

import com.poncn.entity.OrderItem;
import com.poncn.entity.Product;
import com.poncn.entity.User;
import com.poncn.service.OrderItemService;
import com.poncn.service.ProductImageService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/cart")
public class CartController {

    @Resource
    private OrderItemService orderItemService;
    @Resource
    private ProductImageService productImageService;

    @RequestMapping("/forecart")
    public String forecart(HttpServletRequest request, Map<String, Object> map) {
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        long id = user.getId();
        List<OrderItem> oi = orderItemService.queryByCart(id);
        for (OrderItem o : oi) {
            for (Product p : o.getOIProduct()) {
                long productImg = productImageService.queryByPid(p.getId());
                p.setProductImg(productImg);
            }
        }
        map.put("oi", oi);
        return "/fore/cart";
    }
}
