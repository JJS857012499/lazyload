package com.baibu.otherproject.config;

import lombok.Data;

/**
 * @Author jiangjunsheng
 * @Date 2019/12/19
 */
@Data
public class BirdInterface {


    public BirdInterface() {
        System.out.println("bird construct...");
    }

    public void init(){
        System.out.println("bird init...");
    }

    public void destroy(){
        System.out.println("bird destroy...");
    }

    public String say() {
        return "bird say hello!";
    }
}
