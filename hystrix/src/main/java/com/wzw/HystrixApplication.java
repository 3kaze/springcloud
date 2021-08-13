package com.wzw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author wei
 * @Date 2021/8/13
 */
@SpringBootApplication
@EnableFeignClients
@EnableCircuitBreaker
@EnableHystrixDashboard
public class HystrixApplication {
//    http://localhost:8060/actuator/hystrix.stream
//    http://localhost:8060/hystrix
    public static void main(String[] args) {
        SpringApplication.run(HystrixApplication.class, args);
    }
}
