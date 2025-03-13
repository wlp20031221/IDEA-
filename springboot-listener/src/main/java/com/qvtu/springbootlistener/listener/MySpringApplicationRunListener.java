package com.qvtu.springbootlistener.listener;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.stereotype.Component;

/**
 * @author 作者
 * @create 2025-03-13-09:43
 * SpringBoot的监听机制：SpringApplicationRunListener
 * 想要执行必须在spring.factories中配置（新版本SpringBoot中不用重写方法，即默认方法不暴露）
 */

public class MySpringApplicationRunListener implements SpringApplicationRunListener {


}
