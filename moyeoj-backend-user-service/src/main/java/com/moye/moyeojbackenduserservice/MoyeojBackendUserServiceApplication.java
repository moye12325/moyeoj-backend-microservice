package com.moye.moyeojbackenduserservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;


@MapperScan("com.moye.moyeojbackenduserservice.mapper")
@EnableScheduling
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
@SpringBootApplication
@ComponentScan("com.moye")
public class MoyeojBackendUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MoyeojBackendUserServiceApplication.class, args);
    }

}
