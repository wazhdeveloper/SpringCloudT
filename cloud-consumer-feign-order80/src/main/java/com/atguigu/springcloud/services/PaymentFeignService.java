package com.atguigu.springcloud.services;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**声明接口，feign让编写web客户端变得方便。
 * 通常情况下，客户端使用RestTemplate访问地址，转到服务端该地址映射下的方法，然后执行。
 * 使用feign后，客户端可以创建接口，添加@FeignClient后，就可以起到和RestTemplate同样的作用。
 * @author wzhstart
 * @creat 2022-09-18-14:04
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {

    @GetMapping(value = "/payment/get/{id}")
    CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);

    @GetMapping(value = "/payment/feign/timeout")
    String paymentFeignTimeout();
}
