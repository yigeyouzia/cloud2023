package com.cyt.springcloud.service.impl;

import com.cyt.springcloud.dao.PaymentDao;
import com.cyt.springcloud.entities.Payment;
import com.cyt.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author cyt
 * @version 1.0
 */
@Service
public class PaymentServiceImpl implements PaymentService{

    @Resource
    private PaymentDao paymentDao;
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
