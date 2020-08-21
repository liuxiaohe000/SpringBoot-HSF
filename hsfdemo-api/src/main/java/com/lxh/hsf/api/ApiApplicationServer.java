package com.lxh.hsf.api;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * 描述:
 *
 * @author 刘晓禾
 * @create 2020-08-21 15:28
 */
@SpringBootApplication
@MapperScan("com.lxh.hsf.api.dao")
public class ApiApplicationServer extends SpringBootServletInitializer {


    public static void main(String[] args) {
        SpringApplication.run(ApiApplicationServer.class, args);
    }
}