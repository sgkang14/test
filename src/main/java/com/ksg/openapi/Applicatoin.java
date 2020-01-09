package com.ksg.openapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@SpringBootApplication
public class Applicatoin {
    public static void main(String[] args) {
        SpringApplication.run(Applicatoin.class, args);
    }
}
