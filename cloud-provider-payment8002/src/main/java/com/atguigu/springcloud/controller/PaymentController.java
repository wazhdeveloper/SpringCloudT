package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Slf4j
@RestController
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping(value = "/payment/create")
    public CommonResult<Payment> create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        log.info("插入结果：" + result);

        if (result > 0) {
            return new CommonResult<>(200, "插入数据库成功！serverPort: " + serverPort);
        }
        return new CommonResult<>(444, "插入数据库失败", null);
    }


    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("插入结果：" + payment);

        if (payment != null) {
            return new CommonResult<>(200, "查询成功！serverPort: " + serverPort, payment);
        }
        return new CommonResult<>(444, "查询失败，数据库无id = " + id, null);
    }

    @GetMapping(value = "/payment/lb")
    public String getServerPort() {
        return serverPort;
    }

    @GetMapping(value = "/payment/feign/timeout")
    public String paymentFeignTimeout() throws InterruptedException {
        log.info("服务器暂停几秒！");
        Thread.sleep(3000);
        return serverPort;
    }
}
