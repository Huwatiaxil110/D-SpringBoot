package com.foresight.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.foresight.mybatis.mapper")
public class DMybatisCApplication {

    public static void main(String[] args) {
        SpringApplication.run(DMybatisCApplication.class, args);
    }

}
