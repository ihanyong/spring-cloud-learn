package com.ihanyong.spring.cloud.example.provider.user.controller;/**
 * Created by hanyong on 2017/6/12.
 */

import com.ihanyong.spring.cloud.example.provider.user.dao.User;
import com.ihanyong.spring.cloud.example.provider.user.dao.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hanyong
 * @Date 2017/6/12
 */
@RestController
@RefreshScope
public class UserController {
    Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired private DiscoveryClient discoveryClient;
    @Autowired private UserRepository userRepository;

    @Value("${test.name}")
    private String name;
    @Value("${test.pwd}")
    private String pwd;

    @GetMapping("/name/get")
    public String getName() {
        return name;
    }
    @GetMapping("/pwd/get")
    public String getPwd() {
        return pwd;
    }

    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id) {
        logger.info("find user by id {}", id);

        User user = userRepository.findOne(id);
        return user;
    }

    @GetMapping("/service-instance")
    public ServiceInstance serviceInstance() {

        ServiceInstance localServiceInstatnce = discoveryClient.getLocalServiceInstance();

        return localServiceInstatnce;

    }
}
