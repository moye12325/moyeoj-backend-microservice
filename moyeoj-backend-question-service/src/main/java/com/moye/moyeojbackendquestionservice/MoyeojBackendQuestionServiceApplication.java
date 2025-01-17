package com.moye.moyeojbackendquestionservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@MapperScan("com.moye.moyeojbackendquestionservice.mapper")
@EnableScheduling
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
@SpringBootApplication
@ComponentScan("com.moye")
public class MoyeojBackendQuestionServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MoyeojBackendQuestionServiceApplication.class, args);
    }

}
