package com.qf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/page")
public class IndexController {

    @RequestMapping("/tohome")
    public String toHome(){
        return "home";
    }
}
