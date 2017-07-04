package com.ihanyong.spring.cloud.example.consumer.user.with.hystrix.impl;/**
 * Created by hanyong on 2017/6/30.
 */

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author hanyong
 * @Date 2017/6/30
 */
@Service
public class RobbinHystrixService {
    private static final Logger LOGGER = LoggerFactory.getLogger(RobbinHystrixService.class);

    @Autowired private RestTemplate restTemplate;


    @HystrixCommand(fallbackMethod = "fallback")
    public User findById(Long id) {
        User user = restTemplate.getForObject("http://provider-user/user/" + id, User.class);

        return user;
    }

    public User fallback(Long id) {

        LOGGER.warn("into fallback, Id is {}", id);

        User user = new User();

        user.setId(-1L);
        user.setAge(0);
        user.setUsername("default username");

        return user;
    }

}
