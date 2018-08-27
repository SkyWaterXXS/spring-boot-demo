package com.example.springbootdemo.controller;

import com.example.springbootdemo.datasource.mapper.InventoryMapper;
import com.example.springbootdemo.datasource.mapper.InvitationConfigMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * <p>ClassName:com.example.springbootdemo.controller.InventoryController</p>
 * <p>描述:  </p>
 * <p>日期: 2018/7/28 </p>
 *
 * @author xiaoshuo.xxs
 * @version 1.0.0
 * @since 1.0.0
 */
@Slf4j
@Controller
@RequestMapping("/inventory")
public class InventoryController {

    @Resource
    private InventoryMapper inventoryMapper;

    /**
     * http://127.0.0.1:8080/inventory/test
     */
    @RequestMapping("/test")
    @ResponseBody
    public String test() {

        return "ok";
    }

    /**
     * http://127.0.0.1:8080/inventory/test2
     */
    @RequestMapping("/test2")
    @ResponseBody
    public String test2() {
        inventoryMapper.update();
        log.error("s");
        return "ok";
    }
}
