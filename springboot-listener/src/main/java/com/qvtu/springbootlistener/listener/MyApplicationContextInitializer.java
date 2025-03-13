package com.qvtu.springbootlistener.listener;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author 作者
 * @create 2025-03-13-09:39
 * SpringBoot的监听机制：ApplicationContextInitializer
 * 想要执行必须在spring.factories中配置
 */
@Component
public class MyApplicationContextInitializer implements ApplicationContextInitializer {
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        System.out.println("ApplicationContextInitializer...initialize...");
    }
}
