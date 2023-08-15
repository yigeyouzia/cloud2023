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
@SuppressWarnings({"all"})
@Slf4j
public class PaymentController {
    @Value("${server.port}")
    private String ServerPort;

    @RequestMapping("/payment/zk")
    public String paymentzk() {
        return "springcloud with zoonkeeper: " + ServerPort + "\t" + UUID.randomUUID().toString();
    }
}
