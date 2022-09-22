package com.atguigu.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wzhstart
 * @creat 2022-09-17-19:50
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule iRule() {
        return new RandomRule();
    }

}
