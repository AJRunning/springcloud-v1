package com.runningsss.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author liqings
 * @date 2019-02-19
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(value = "com.runningsss.cloud")
@ComponentScan("com.runningsss.cloud")
public class DeptConsumerFeign_App {

    public static void main(String args[]) {
        SpringApplication.run(DeptConsumerFeign_App.class, args);
    }

}
