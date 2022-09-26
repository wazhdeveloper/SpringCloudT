package com.atguigu.springcloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wzhstart
 * @creat 2022-09-26-10:38
 */
@Slf4j
@RestController
public class FlowLimitController {

    @GetMapping("/sentinel/sentA")
    public String sentA() {
        return "-----testA";
    }

    @GetMapping("/sentinel/sentB")
    public String sentB() {
        return "-----testB";
    }

    @GetMapping("/sentinel/sentD")
    @SentinelResource(value = "fallback", blockHandler = "fallbackMethod")
    public String sentD(@RequestParam(value = "p1",required = false) String p1,
                        @RequestParam(value = "p2",required = false) String p2) {
        return "this method used to verify the fallback method";
    }

    public String fallbackMethod(String p1, String p2, BlockException blockException) {
        log.info("fallback method has been called!");
        return "fallback method called!";
    }
}
