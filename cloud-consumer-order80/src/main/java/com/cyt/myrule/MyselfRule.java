package com.cyt.myrule;

import com.netflix.loadbalancer.BestAvailableRule;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author cyt
 * @version 1.0
 */
@Configuration
public class MyselfRule {
    @Bean
    public IRule myRule() {
        return new RoundRobinRule(); // 定义随机算法
    }
}
