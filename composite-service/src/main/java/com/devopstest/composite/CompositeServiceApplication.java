package com.devopstest.composite;

import com.devopstest.jwt.DevOpsTestJWTConfig;
import com.devopstest.log.LoggingAspect;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.web.client.RestTemplate;

/**
 * Created by demo
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@RefreshScope
@EnableZuulProxy
@EnableHystrix
@Import({DevOpsTestJWTConfig.class, LoggingAspect.class})
public class CompositeServiceApplication {
    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(CompositeServiceApplication.class, args);
    }
}