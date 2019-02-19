package com.runningsss.cloud.cfgbean;


import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
 * @author liqings
 * @date 2019-02-19
 */
@Configuration
public class ConfigBean {

    @Bean
   public RestTemplateBuilder getRestTemplate(){
       return new RestTemplateBuilder();
   }
}
