package com.ihanyong.spring.cloud.example.provider.user;/**
 * Created by hanyong on 2017/6/30.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author hanyong
 * @Date 2017/6/30
 */

@SpringBootApplication
@EnableEurekaClient
public class UserProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserProviderApplication.class, args);
    }
}
