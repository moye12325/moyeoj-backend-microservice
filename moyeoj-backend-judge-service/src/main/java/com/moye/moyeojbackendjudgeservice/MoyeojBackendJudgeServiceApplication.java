package com.moye.moyeojbackendjudgeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
@SpringBootApplication
@ComponentScan("com.moye")
public class MoyeojBackendJudgeServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MoyeojBackendJudgeServiceApplication.class, args);
    }

}
