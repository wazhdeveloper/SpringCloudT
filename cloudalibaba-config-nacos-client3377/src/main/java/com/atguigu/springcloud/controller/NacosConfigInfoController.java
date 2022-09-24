package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wzhstart
 * @creat 2022-09-24-19:49
 */
@RestController
@RefreshScope
public class NacosConfigInfoController {

    @Value("${config.info}")
    private String ConfigInfo;

    @GetMapping("/config/getInfo")
    public String getConfigInfo() {
        return ConfigInfo;
    }


}
