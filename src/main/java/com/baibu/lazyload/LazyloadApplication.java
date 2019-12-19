package com.baibu.lazyload;

import com.baibu.otherproject.config.DuckInterface;
import com.baibu.otherproject.config.XXOOConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@ImportResource("classpath:xxoo-config.xml")
@Import(XXOOConfig.class)
@SpringBootApplication
public class LazyloadApplication {

    public static void main(String[] args) {
        SpringApplication.run(LazyloadApplication.class, args);
    }


    //如果把下面的代码给注释掉，这时候懒加载就会生效，不会生成DuckInterface和相关依赖类
    @Autowired
    private DuckInterface duckInterface;

    @GetMapping(value = "/duck")
    public String say(){
        return duckInterface.say();
    }

}
