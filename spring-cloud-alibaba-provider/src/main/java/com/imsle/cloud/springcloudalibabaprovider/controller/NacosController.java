package com.imsle.cloud.springcloudalibabaprovider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @作者: Seale
 * @时间: 2021/08/03 6:42 下午
 * @说明:
 * @类名: NacosController
 */
@RestController
public class NacosController {

    @GetMapping("/nacos/{str}")
    public String hello(@PathVariable String str){
        System.out.println("远程调用了！");
        return "你好nacos：" + str;
    }
}
