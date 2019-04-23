package com.jiaheqi.mybatisdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//用来扫描Mapper接口的注解，用来扫描Mapper包下面的接口
@MapperScan("com.jiaheqi.mybatisdemo.*")
public class MybatisdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisdemoApplication.class, args);
    }

}

