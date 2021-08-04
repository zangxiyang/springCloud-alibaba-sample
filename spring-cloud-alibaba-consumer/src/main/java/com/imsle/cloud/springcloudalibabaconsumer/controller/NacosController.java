package com.imsle.cloud.springcloudalibabaconsumer.controller;

import com.imsle.cloud.springcloudalibabaconsumer.feignService.NacosFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @作者: Seale
 * @时间: 2021/08/04 12:06 上午
 * @说明:
 * @类名: NacosController
 */
@RestController
public class NacosController {

    @Autowired
    NacosFeignService nacosFeignService;

    @GetMapping("/consumer/{str}")
    public String testConsumer(@PathVariable String str) {
        return nacosFeignService.hello(str);
    }
}
