package com.ihanyong.spring.cloud.example.consumer.user.impl;/**
 * Created by hanyong on 2017/6/30.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author hanyong
 * @Date 2017/6/30
 */
@Service
public class RobbinService {

    @Autowired private RestTemplate restTemplate;


    public User findById(Long id) {
        User user = restTemplate.getForObject("http://provider-user/user/" + id, User.class);

        return user;
    }
}
