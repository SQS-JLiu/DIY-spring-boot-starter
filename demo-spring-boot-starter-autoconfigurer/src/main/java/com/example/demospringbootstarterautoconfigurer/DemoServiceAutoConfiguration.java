package com.example.demospringbootstarterautoconfigurer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnWebApplication  //web应用生效
@EnableConfigurationProperties(DemoProperties.class)
public class DemoServiceAutoConfiguration {

    @Autowired
    DemoProperties demoProperties;

    @Bean
    public DemoService demoService(){
        DemoService demoService = new DemoService();
        demoService.setDemoProperties(demoProperties);
        return demoService;
    }
}
