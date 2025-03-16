package com.qvtu.actuator;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 作者
 * @create 2025-03-16-09:52
 *
 */
@RestController
@RequestMapping("/user")
public class User {

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
