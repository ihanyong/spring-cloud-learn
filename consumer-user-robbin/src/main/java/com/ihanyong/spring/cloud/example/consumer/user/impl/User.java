package com.ihanyong.spring.cloud.example.consumer.user.impl;/**
 * Created by hanyong on 2017/6/12.
 */


/**
 * @author hanyong
 * @Date 2017/6/12
 */
public class User {
    private Long id;

    private String username;
    private Integer age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
