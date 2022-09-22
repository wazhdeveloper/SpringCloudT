package com.atguigu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author wzhstart
 * @creat 2022-09-17-12:30
 */
@Slf4j
@RestController
public class OrderConsulController {

    @Resource
    private RestTemplate restTemplate;

    private final static String INVOKE_URL = "http://consul-provider-payment";

    @GetMapping("/consumer/consul")
    public String PaymentInfo() {
        String result = restTemplate.getForObject(INVOKE_URL + "/payment/consul", String.class);
        System.out.println("消费者调用支付服务(consul)--->result:" + result);
        return result;
    }
}
