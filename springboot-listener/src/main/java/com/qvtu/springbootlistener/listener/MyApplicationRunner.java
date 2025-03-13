package com.qvtu.springbootlistener.listener;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * @author 作者
 * @create 2025-03-13-09:49
 * SpringBoot的监听机制：ApplicationRunner
 * 当项目启动后执行run方法
 */
@Component
public class MyApplicationRunner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("ApplicationRunner...run");
    }
}
