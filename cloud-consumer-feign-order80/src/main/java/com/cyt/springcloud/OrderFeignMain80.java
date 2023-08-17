package com.cyt.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author cyt
 * @version 1.0
 */
@SpringBootApplication
@EnableFeignClients // 使用feign
public class OrderFeignMain80 {
     public static void main(String[] args) {
           SpringApplication.run(OrderFeignMain80.class, args);
      }
}
