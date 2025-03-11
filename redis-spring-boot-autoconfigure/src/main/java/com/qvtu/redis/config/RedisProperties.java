package com.qvtu.redis.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author 作者
 * @create 2025-03-11-10:31
 */

@ConfigurationProperties(prefix = "redis")
public class RedisProperties {

    private String host = "localhost";
    private int port = 6379;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
