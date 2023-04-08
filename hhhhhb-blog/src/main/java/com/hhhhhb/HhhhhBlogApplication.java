package com.hhhhhb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hhhhhb.mapper")
public class HhhhhBlogApplication {
    public static void main(String[] args) {
        SpringApplication.run(HhhhhBlogApplication.class, args);
    }
}
