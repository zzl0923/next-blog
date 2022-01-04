package com.example.nextblog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
@MapperScan("com.example.nextblog.admin.mapper")
public class NextBlogApplication  {

    public static void main(String[] args) {
        SpringApplication.run(NextBlogApplication.class, args);
    }

}
