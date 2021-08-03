package com.imsle.cloud.springcloudalibabaprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
// 开启服务注册发现
@EnableDiscoveryClient
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

}
