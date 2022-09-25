package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderNacosController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/nacos/get/{id}")
    public String getServerPort(@PathVariable("id") Integer id) {
        int decode = Integer.bitCount(id);
        return "The port of this service is " + serverPort + decode;
    }

}
