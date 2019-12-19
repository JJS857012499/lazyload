package com.baibu.otherproject.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import javax.annotation.Resource;

/**
 * 这里相当是被另外项目的配置信息，
 * @Author jiangjunsheng
 * @Date 2019/12/19
 */
@Configuration
@ConditionalOnBean(ApplicationContext.class)
public class XXOOConfig {

    @Resource
    private ApplicationContext applicationContext;

    @Bean
    @Lazy
    public DuckInterface duck(BirdInterface birdInterface) {
        return new DuckInterface(birdInterface);
    }

    @Bean
    @Lazy
    public BirdInterface bird() {
        return new BirdInterface();
    }

}
