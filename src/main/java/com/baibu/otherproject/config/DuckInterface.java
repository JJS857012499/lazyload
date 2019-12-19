package com.baibu.otherproject.config;

import lombok.Data;

/**
 * @Author jiangjunsheng
 * @Date 2019/12/19
 */
@Data
public class DuckInterface {


    public DuckInterface(BirdInterface bird) {
        System.out.println("duck construct...");
    }

    public void init(){
        System.out.println("duck init...");
    }

    public void destroy(){
        System.out.println("duck destroy...");
    }

    public String say() {
        return "duck say hello!";
    }
}
