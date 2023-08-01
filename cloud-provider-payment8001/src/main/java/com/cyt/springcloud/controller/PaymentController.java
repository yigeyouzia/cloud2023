package com.cyt.springcloud.controller;

import com.cyt.springcloud.entities.CommonResult;
import com.cyt.springcloud.entities.Payment;
import com.cyt.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;


/**
 * @author cyt
 * @version 1.0
 */
@RestController
@Slf4j
@SuppressWarnings({"all"})
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String ServefPort;

    @Resource
    private DiscoveryClient discoveryClient;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment) { //@RequsetBody 的请求参数是转化为JSON字符串形式
        int result = paymentService.create(payment);
        log.info("**插入结果**：{}", result);
        if (result > 0) {
            return new CommonResult(200, "插入数据成功:ServefPort " + ServefPort + payment.toString(), result);
        }
        return new CommonResult(444, "插入数据失败", null);
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("**查询结果**：{}", payment);
        if (payment != null) {
            return new CommonResult(200, "查询成功,ServefPort: " + ServefPort, payment);
        }
        return new CommonResult(444, "查询数据失败，查询ID:  " + id, null);
    }

    // discovery配置信息对外暴露
    @GetMapping(value = "/payment/discovery")
    public Object discovery() {
        List<String> services = discoveryClient.getServices();
        for (String service : services) {
            log.info("**discovery: {}", service);
        }
        log.info("*---------------*");
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        for (ServiceInstance instance : instances) {
            log.info(instance.getServiceId() + "\t" + instance.getHost()
                    + "\t" + instance.getPort() + "\t" + instance.getUri());
        }
        return this.discoveryClient;
    }
}
