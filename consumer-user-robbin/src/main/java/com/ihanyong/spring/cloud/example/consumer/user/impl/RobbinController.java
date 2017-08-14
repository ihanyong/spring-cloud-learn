package com.ihanyong.spring.cloud.example.consumer.user.impl;/**
 * Created by hanyong on 2017/6/30.
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hanyong
 * @Date 2017/6/30
 */
@RestController
public class RobbinController {

    Logger logger = LoggerFactory.getLogger(RobbinController.class);

    @Autowired
    private RobbinService robbinService;


    @GetMapping("/robbin/{id}")
    public User findById(@PathVariable Long id) {
        logger.info("get user {}", id);

        return robbinService.findById(id);
    }

}
