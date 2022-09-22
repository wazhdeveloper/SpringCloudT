package com.atguigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author wzhstart
 * @creat 2022-09-15-9:17
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
//    @LoadBalanced       //负载均衡
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}
