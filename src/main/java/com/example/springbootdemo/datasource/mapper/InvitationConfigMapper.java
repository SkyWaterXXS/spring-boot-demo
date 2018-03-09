package com.example.springbootdemo.datasource.mapper;

import com.example.springbootdemo.datasource.bean.InvitationConfig;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * @author xuxiaoshuo 2018/3/8
 */
@Repository
public interface InvitationConfigMapper {
    List<InvitationConfig> find(InvitationConfig entity);

    long findCount(InvitationConfig entity);

    InvitationConfig get(long id);

    InvitationConfig getByConfigKey(@Param("configKey") String configKey);

    int update(InvitationConfig entity);

    void insert(InvitationConfig entity);

    void delete(@Param("id") Long id);
}
