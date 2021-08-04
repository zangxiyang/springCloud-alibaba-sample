package com.imsle.cloud.springcloudalibabaconsumer.feignService;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @作者: Seale
 * @时间: 2021/08/04 12:02 上午
 * @说明:
 * @类名: NacosFeignService
 */

@Component
@FeignClient("imsle-provider")
public interface NacosFeignService {

    @GetMapping("/nacos/{str}")
    String hello(@PathVariable String str);
}
