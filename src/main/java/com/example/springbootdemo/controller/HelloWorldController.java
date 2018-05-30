package com.example.springbootdemo.controller;

import com.example.springbootdemo.datasource.mapper.InvitationConfigMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * @author xuxiaoshuo 2018/1/16
 */
@Controller
@RequestMapping("/helloworld")
public class HelloWorldController {

    @Autowired
    private InvitationConfigMapper invitationConfigMapper;

    @RequestMapping("/test")
    @ResponseBody
    public String test(String name) {
        return "hello " + name;
    }

    @RequestMapping("/testView")
    public String testView(Model model) {
        model.addAttribute("name", "testName");
        return "testView";
    }

    //http://127.0.0.1:8080/helloworld/testDataSource?id=1
    @RequestMapping("/testDataSource")
    @ResponseBody
    public Object testDataSource(int id) {
        return invitationConfigMapper.get(id);
    }

    //http://127.0.0.1:8080/helloworld/testDataSourceFindMap
    @RequestMapping("/testDataSourceFindMap")
    @ResponseBody
    public Object testDataSourceFindMap() {

        List<Map<String,String>> result=invitationConfigMapper.findMap();

        return result;
    }
}
