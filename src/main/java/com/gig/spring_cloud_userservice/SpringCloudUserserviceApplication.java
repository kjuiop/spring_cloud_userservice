package com.gig.spring_cloud_userservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudUserserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudUserserviceApplication.class, args);
    }

}


/**
 * @EnableDiscoveryClient
 * @EnableEurekaClient
 *
 * Eureka 가 상품화 시켜 놓은 것이지만, 둘중 어느 하나를 선택하더라도 상관없다.
 */