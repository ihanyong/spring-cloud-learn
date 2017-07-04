package com.ihanyong.spring.cloud.example.provider.user.controller;/**
 * Created by hanyong on 2017/6/12.
 */

import com.ihanyong.spring.cloud.example.provider.user.dao.User;
import com.ihanyong.spring.cloud.example.provider.user.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hanyong
 * @Date 2017/6/12
 */
@RestController
public class UserController {

    @Autowired private DiscoveryClient discoveryClient;
    @Autowired private UserRepository userRepository;

    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id) {
        User user = userRepository.findOne(id);
        return user;
    }

    @GetMapping("/service-instance")
    public ServiceInstance serviceInstance() {

        ServiceInstance localServiceInstatnce = discoveryClient.getLocalServiceInstance();

        return localServiceInstatnce;

    }
}
