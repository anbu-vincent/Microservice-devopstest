package com.devopstest.venue;

import com.devopstest.jwt.DevOpsTestJWTConfig;
import com.devopstest.log.LoggingAspect;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Import;
import org.springframework.data.couchbase.repository.config.EnableCouchbaseRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

/**
 * Created by demo
 */
@EnableEurekaClient
@EnableResourceServer
@EnableScheduling
@SpringBootApplication
@EnableCouchbaseRepositories(basePackages = "com.devopstest.venue.db.repository")
@Import({DevOpsTestJWTConfig.class, LoggingAspect.class})
public class VenueApplication {

    public static void main(String[] args) {
        SpringApplication.run(VenueApplication.class, args);
    }
}
