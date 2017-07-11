package com.ihanyong.spring.cloud.example.config.server;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by Administrator on 2017/7/11.
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {
    public static void main(String[] args) {
        System.out.println("hanyong");
        SpringApplication.run(ConfigServerApplication.class, args);
    }
}
