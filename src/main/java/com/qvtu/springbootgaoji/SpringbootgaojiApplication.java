package com.qvtu.springbootgaoji;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisSentineled;


@SpringBootApplication
public class SpringbootgaojiApplication {

    public static void main(String[] args) {
        //启动SpringBoot的应用，返回Spring的IOC容器
        ConfigurableApplicationContext context = SpringApplication.run(SpringbootgaojiApplication.class, args);

//        //获取Bean，redisTemplate
//        Object redisTemplate = context.getBean("redisTemplate");
//        System.out.println(redisTemplate);

//        Object user = context.getBean("user");
//        System.out.println(user);

//        Object user = context.getBean("user2");
//        System.out.println(user);

        Jedis jedis = context.getBean(Jedis.class);
        System.out.println(jedis);

        jedis.set("name","itcast");

        String name = jedis.get("name");
        System.out.println(name);



    }

//    检验@ConditionalOnMissingBean(name = "jedis")是否生效，如果RedisAutoConfiguration中的Jedis方法中的输出语句没有执行，则说明已经生效
    @Bean
    public Jedis jedis(){
        return new Jedis("localhost",6379);
    }

}
