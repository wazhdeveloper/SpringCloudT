package springcloud.controller;

import cn.hutool.core.lang.UUID;
import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @author wzhstart
 * @creat 2022-09-27-19:30
 */
@RestController
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;
    public static HashMap<Long, Payment> hashMap = new HashMap<>();

    static {
        hashMap.put(1L, new Payment(1L, UUID.randomUUID().toString() + "hashmap1"));
        hashMap.put(2L, new Payment(2L, UUID.randomUUID().toString() + "hashmap2"));
        hashMap.put(3L, new Payment(3L, UUID.randomUUID().toString() + "hashmap3"));
    }

    @GetMapping(value = "/paymentSQL/{id}")
    public CommonResult<Payment> paymentSQL(@PathVariable("id") Long id) {
        Payment payment = hashMap.get(id);
        return (CommonResult<Payment>) new CommonResult(200, "from mysql,serverPort:  " + serverPort, payment);
    }
}
