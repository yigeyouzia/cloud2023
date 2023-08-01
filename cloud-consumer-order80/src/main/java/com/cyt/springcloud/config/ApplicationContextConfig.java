package com.cyt.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author cyt
 * @version 1.0
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    @LoadBalanced // 赋予RestTemplate负载均衡能力
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
