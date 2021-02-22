package com.stu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: p_quzhou
 * @Description: 同步启动类
 * @Date: 2021/2/22 11:45
 */
@SpringBootApplication
@EnableDiscoveryClient
public class DbSyncApplication {

    public static void main(String[] args) {
        SpringApplication.run(DbSyncApplication.class, args);
    }
}
