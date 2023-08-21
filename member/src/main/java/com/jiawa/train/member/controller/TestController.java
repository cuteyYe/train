package com.jiawa.train.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope //实时刷新 如nacos
public class TestController {
    @Value("${test.nacos}")
    private String testNacos;

    @Autowired
    Environment environment;

    @GetMapping("/hello")
    public String hello(){
        String prot = environment.getProperty("local.server.prot");
        return String.format("Hello %s,端口:%s",testNacos,prot);
    }
}
