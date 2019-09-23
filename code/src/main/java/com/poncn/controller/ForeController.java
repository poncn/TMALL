package com.poncn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author pency gui
 * @version version 1.0
 * @date 2019/9/23 0023
 */
@Controller
public class ForeController {

    @RequestMapping("/index")
    public String index(){
        return "/fore/home";
    }


}
