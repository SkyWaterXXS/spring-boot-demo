package com.example.springbootdemo.datasource.mapper;


import org.springframework.stereotype.Repository;


/**
 * @author xuxiaoshuo 2018/3/8
 */
@Repository
public interface InventoryMapper {

    /**
     * 扣减库存操作
     */
    void update();
}
