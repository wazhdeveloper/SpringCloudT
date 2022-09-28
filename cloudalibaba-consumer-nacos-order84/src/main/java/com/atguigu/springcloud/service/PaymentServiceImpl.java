package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @author wzhstart
 * @creat 2022-09-27-21:20
 */
@Component
public class PaymentServiceImpl implements PaymentService {
    //重写被feign标注的接口，作为回调方法
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(444, "服务降级返回,没有该流水信息",
                new Payment(id, "errorSerial......"));
    }
}
