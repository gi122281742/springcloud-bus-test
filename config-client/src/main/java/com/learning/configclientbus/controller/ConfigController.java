package com.learning.configclientbus.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: D7-Dj
 * @Date: 2020/4/11 11:38
 */
@RestController
@RefreshScope
public class ConfigController {
    @Value("${name}")
    String name;
    @GetMapping("/hello")
    public String helloConfig(){
        return name;
    }
}
