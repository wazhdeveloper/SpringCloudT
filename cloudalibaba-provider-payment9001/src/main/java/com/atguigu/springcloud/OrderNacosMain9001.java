package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author wzhstart
 * @creat 2022-09-24-15:29
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderNacosMain9001 {
    public static void main(String[] args) {
        SpringApplication.run(OrderNacosMain9001.class, args);
    }
}
