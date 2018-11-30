package com.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @version V1.0.1
 * @classname HelloService
 * @description:
 * @author: longcong
 * @email: longcong@aliyun.com
 * @date: 2018-11-30  15:24
 **/
@FeignClient(value = "web")
@RequestMapping(value = "/hello")
public interface HelloService {
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String SHello(@RequestParam(value = "name") String name);
}
