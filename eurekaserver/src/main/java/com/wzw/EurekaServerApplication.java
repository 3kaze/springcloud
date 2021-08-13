package com.wzw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author wei
 * @Date 2021/8/12
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {
//    http://localhost:8761/
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }
}
