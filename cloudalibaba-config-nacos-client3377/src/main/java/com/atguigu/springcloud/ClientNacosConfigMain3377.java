package com.atguigu.springcloud;

import ch.qos.logback.core.net.server.Client;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author wzhstart
 * @creat 2022-09-25-10:51
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ClientNacosConfigMain3377 {
    public static void main(String[] args) {
        SpringApplication.run(ClientNacosConfigMain3377.class, args);
    }
}
