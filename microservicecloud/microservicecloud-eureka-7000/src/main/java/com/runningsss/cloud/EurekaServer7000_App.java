package com.runningsss.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author liqings
 * @date 2019-02-20
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer7000_App {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7000_App.class,args);
    }
}
