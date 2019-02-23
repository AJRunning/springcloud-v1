package com.runningsss.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author liqings
 * @date 2019-02-19
 */
@SpringBootApplication
@EnableEurekaClient
public class DeptConsumer80_App {

    public static void main(String args[]) {
        SpringApplication.run(DeptConsumer80_App.class, args);
    }

}
