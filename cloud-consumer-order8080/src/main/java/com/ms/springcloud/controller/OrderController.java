package com.ms.springcloud.controller;

import com.ms.springcloud.model.CommonResult;
import com.ms.springcloud.model.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/create")
    public CommonResult<Payment> create(Payment payment){
        CommonResult forObject = restTemplate.postForObject("http://cloud-payment-service/payment/create", payment, CommonResult.class);
        return forObject;
    }

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        CommonResult forObject = restTemplate.getForObject("http://cloud-payment-service/payment/get/"+id, CommonResult.class);
        return forObject;
    }

    @GetMapping("/consumer/payment/zipkin")
    public String zipkin(){
        String forObject = restTemplate.getForObject("http://cloud-payment-service/payment/zipkin", String.class);
        return forObject;
    }
}
