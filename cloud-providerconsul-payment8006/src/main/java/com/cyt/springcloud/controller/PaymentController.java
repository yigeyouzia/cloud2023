package com.cyt.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author cyt
 * @version 1.0
 */
@RestController
@Slf4j
public class PaymentController {
    @Value("${server.port}")
    private String ServerPort;

    @RequestMapping("/payment/consul")
    public String paymentConsul() {
        return "springcloud with consul: " + ServerPort + "\t" + UUID.randomUUID().toString();
    }
}
