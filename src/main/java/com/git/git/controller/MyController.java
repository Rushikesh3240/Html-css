package com.git.git.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
    
    @GetMapping("/git1")
    public String example(){

        return "git1";
    }

    @GetMapping("/acer")
    public String gt(){

        return "acer";
    }
}
