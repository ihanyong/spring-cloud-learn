package com.ihanyong.spring.cloud.example.provider.user.dao;/**
 * Created by hanyong on 2017/6/12.
 */

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author hanyong
 * @Date 2017/6/12
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
