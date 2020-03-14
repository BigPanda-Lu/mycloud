package com.ms.springcloud.controller;

import com.ms.springcloud.feign.PaymentFeignClient;
import com.ms.springcloud.model.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {
    @Autowired
    private PaymentFeignClient paymentFeignClient;

    @RequestMapping("/consumer/payment/get/{id}")
    public CommonResult get(@PathVariable("id") Long id){
        return paymentFeignClient.get(id);
    }

    @RequestMapping("/consumer/payment/timeout")
    public String timeout(){
        return paymentFeignClient.timeout();
    }
}
