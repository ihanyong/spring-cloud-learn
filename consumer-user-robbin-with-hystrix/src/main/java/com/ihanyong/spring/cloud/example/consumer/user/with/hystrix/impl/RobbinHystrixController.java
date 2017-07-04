package com.ihanyong.spring.cloud.example.consumer.user.with.hystrix.impl;/**
 * Created by hanyong on 2017/6/30.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hanyong
 * @Date 2017/6/30
 */
@RestController
public class RobbinHystrixController {

    @Autowired
    private RobbinHystrixService robbinService;


    @GetMapping("/robbin/{id}")
    public User findById(@PathVariable Long id) {

        return robbinService.findById(id);
    }

}
