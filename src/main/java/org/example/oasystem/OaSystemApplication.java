package org.example.oasystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.example.oasystem.mapper")
public class OaSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(OaSystemApplication.class, args);
    }

}
