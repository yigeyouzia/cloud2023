package com.cyt.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author cyt
 * @version 1.0
 */

@EnableDiscoveryClient
@SpringBootApplication
public class NacosConfigClientMain3377 {
     public static void main(String[] args) {
           SpringApplication.run(NacosConfigClientMain3377.class, args);
      }
}
