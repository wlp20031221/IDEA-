package com.qvtu.springbootlistener.listener;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author 作者
 * @create 2025-03-13-09:46
 * SpringBoot的监听机制：CommandLineRunner
 */
@Component
public class MyCommandLineRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("CommandLineRunner...run...");
    }
}
