package com.example.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author xuxiaoshuo 2018/1/16
 */
@Controller
@RequestMapping("/helloworld")
public class HelloWorldController {

    @RequestMapping("/test")
    @ResponseBody
    public String test(String name) {
        return "hello " + name;
    }
}
