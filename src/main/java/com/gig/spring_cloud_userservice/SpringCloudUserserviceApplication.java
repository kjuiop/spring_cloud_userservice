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
 *
 * application.yml 파일에 eureka client 환경설정을 한다.
 *
 * register-with-eureka: true
 *     fetch-registry: true
 *     service-url:
 *       defaultZone: http://127.0.0.1:8761/eureka
 *
 * 자기자신 서버를 eureka client 에 등록
 * eureka server IP 주소를 defaultZone 에 등록하여 Discovery Server 에 연동한다.
 *
 */