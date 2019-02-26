package com.runningsss.myrule;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.Server;
import org.springframework.context.annotation.Bean;

/**
 * @author liqings
 * @date 2019-02-25
 */
public class MySelfRule{

    @Bean
    public IRule myRule(){
        return new RandowRuleQS();
    }

}
