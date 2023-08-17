package com.cyt.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author cyt
 * @version 1.0
 */
@SuppressWarnings("all")
@Component
public class MyLB implements LoadBalancer {
    private AtomicInteger atomicInteger = new AtomicInteger(0);


    @Override
    public ServiceInstance instances(List<ServiceInstance> serviceInstances) {
        return null;
    }
}
