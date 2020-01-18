package com.jzy.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule(){
        //return new RandomRule();//用重新选择的随机算法代替之前的轮询算法
        //return new RetryRule();
        return new RandomRule_ZY();//采用自定义的算法
    }

}
