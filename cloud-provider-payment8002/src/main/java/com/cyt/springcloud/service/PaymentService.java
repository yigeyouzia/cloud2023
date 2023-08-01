package com.cyt.springcloud.service;

import com.cyt.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author cyt
 * @version 1.0
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
