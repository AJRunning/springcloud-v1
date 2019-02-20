package com.runningsss.cloud.cfgbean;


import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author liqings
 * @date 2019-02-19
 */
@Configuration
public class ConfigBean {

    @Bean
   public RestTemplate getRestTemplate(){
       return new RestTemplate();
   }
}
