package com.ihanyong.spring.cloud.example.start;/**
 * Created by hanyong on 2017/6/12.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author hanyong
 * @Date 2017/6/12
 */
@SpringBootApplication
@EnableDiscoveryClient()
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
