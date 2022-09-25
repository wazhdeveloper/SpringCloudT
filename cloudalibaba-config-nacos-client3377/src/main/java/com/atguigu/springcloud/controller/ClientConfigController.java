package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wzhstart
 * @creat 2022-09-25-10:52
 */
@RestController
@RefreshScope
public class ClientConfigController {

    @Value("${config.info}")
    private String ConfigInfo;

    @GetMapping("/nacos/config")
    public String getConfigInfo() {
        return ConfigInfo;
    }

}
