package com.ms.springcloud.feign;

import com.ms.springcloud.model.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("cloud-payment-service")
public interface PaymentFeignClient {
    @GetMapping("/payment/get/{id}")
    public CommonResult get(@PathVariable("id") Long id);

    @GetMapping("/payment/feign/timeout")
    public String timeout();
}
