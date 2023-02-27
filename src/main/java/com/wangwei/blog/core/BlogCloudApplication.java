package com.wangwei.blog.core;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@MapperScan("com.site.blog.my.core.dao")
@SpringBootApplication
public class BlogCloudApplication {
    public static void main(String[] args) {
        SpringApplication.run(BlogCloudApplication.class, args);
    }
}
