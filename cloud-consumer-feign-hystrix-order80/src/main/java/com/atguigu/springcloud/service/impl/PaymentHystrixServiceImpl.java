package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.service.PaymentHystrixService;
import org.springframework.stereotype.Component;

/**
 * @author wzhstart
 * @creat 2022-09-20-18:58
 */
@Component
public class PaymentHystrixServiceImpl implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "抱歉，服务调用失败，服务小妹走神了，(。・＿・。)ﾉI’m sorry~";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "抱歉，服务调用失败，服务小妹走神了，(。・＿・。)ﾉI’m sorry~";
    }

    @Override
    public String paymentCircuitBreaker(Integer id) {
        return "抱歉，服务调用失败，服务小妹走神了，(。・＿・。)ﾉI’m sorry~";
    }
}
