package com.fmin.minpicturebackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@MapperScan("com.fmin.minpicturebackend.mapper")
@EnableAspectJAutoProxy(exposeProxy = true)
public class MinPictureBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(MinPictureBackendApplication.class, args);
    }

}
