package com.lvcong.emprise;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lvcong.emprise.dao")
public class EmpriseApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmpriseApplication.class, args);
    }

}
