package com.ms.alicloud.service;
import com.ms.springcloud.model.CommonResult;
import com.ms.springcloud.model.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentFallbackService implements PaymentService{
    @Override
    public CommonResult<Payment> PaymentSQL(Long id) {
        return new CommonResult<>(44444,"服务降级返回，----PaymentFallbackService",new Payment(id,"errorSerial"));
    }
}
