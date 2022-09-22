package com.atguigu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author wzhstart
 * @creat 2022-09-17-10:26
 */
@RestController
@Slf4j
public class OrderZKController {

    private String PaymentURL = "http://cloud-provider-payment";

    @Resource
    private RestTemplate restTemplate;

    @Value("${server.port}")
    private String port;

    @GetMapping("/consumer/zk")
    public String paymentZK() {
        String message = restTemplate.getForObject(PaymentURL + "/payment/zk", String.class);
        log.info("consumer send the message which it receive from the payment,port: " + port);
        return message;
    }

}
