package com.cyt.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author cyt
 * @version 1.0
 */
@SuppressWarnings({"all"})
@RestController
@Slf4j
public class OrderConsulController {
    //    public static final String PAYMENT_URL = "http://localhost:8001"; 单机版，写死
    public static final String INVOKE_URL = "http://consul-provider-payment";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/consul")
    public String paymentInfo() {
        String res = restTemplate.getForObject(INVOKE_URL + "/payment/consul", String.class);
        return  res;
    }
}
