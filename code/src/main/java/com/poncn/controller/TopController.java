package com.poncn.controller;

import com.poncn.entity.User;
import com.poncn.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
@RequestMapping("/top")
public class TopController {
    @Resource
    private UserService userService;

    @RequestMapping("/loginPage")
    public String loginPage() {
        return "/fore/login";
    }

    @RequestMapping("/registerPage")
    public String registerPage() {
        return "/fore/register";
    }

    @RequestMapping("/registerSuccess")
    public String registerSuccess() {
        return "/fore/registerSuccess";
    }

    @RequestMapping("/foreregister")
    public String foreregister(@RequestParam(name = "name", required = true, defaultValue = "") String name, @RequestParam(name = "password", required = true, defaultValue = "") String password, Map<String, String> map) {
        User user = new User();
        user.setName(name);
        user.setPassword(password);
        if (userService.queryByName(user) != null) {
            String msg = "注册失败:用户名已存在!";
            map.put("msg", msg);
            return "forward:/registerPage";
        }
        userService.insert(user);
        return "redirect:/registerSuccess";
    }

    @RequestMapping("/forelogin")
    public String forelogin(@RequestParam(name = "name", required = true, defaultValue = "") String name, @RequestParam(name = "password", required = true, defaultValue = "") String password, Map<String, String> map, HttpSession session) {
        User user = new User();
        user.setName(name);
        user.setPassword(password);
        if ((user = userService.queryByName(user)) != null) {
            session.setAttribute("user", user);
            return "redirect:/index";
        } else {
            String msg = "登录失败:用户名或密码错误!";
            map.put("msg", msg);
            return "forward:/loginPage";
        }
    }

    @RequestMapping("/forelogout")
    public String forelogout(HttpSession session) {
        session.invalidate();
        return "forward:/index";
    }
}
