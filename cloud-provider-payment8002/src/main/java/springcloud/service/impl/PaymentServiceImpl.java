//package springcloud.service.impl;
//
//import com.ms.springcloud.model.Payment;
//import org.springframework.stereotype.Service;
//import springcloud.dao.PaymentMapper;
//import springcloud.service.PaymentService;
//
//import javax.annotation.Resource;
//
//
//@Service
//public class PaymentServiceImpl implements PaymentService {
//    @Resource
//    private PaymentMapper paymentMapper;
//
//    @Override
//    public int create(Payment payment) {
//        return paymentMapper.create(payment);
//    }
//
//    @Override
//    public Payment getPaymentById(Long id) {
//        return paymentMapper.getPaymentById(id);
//    }
//}
