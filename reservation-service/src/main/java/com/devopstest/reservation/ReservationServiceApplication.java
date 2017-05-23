package com.devopstest.reservation;

import com.devopstest.jwt.DevOpsTestJWTConfig;
import com.devopstest.log.LoggingAspect;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

/**
 * Created by demo
 */
@EnableResourceServer
@EnableScheduling
@EnableEurekaClient
@SpringBootApplication
@Import({DevOpsTestJWTConfig.class, LoggingAspect.class})
public class ReservationServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ReservationServiceApplication.class, args);
    }
}
