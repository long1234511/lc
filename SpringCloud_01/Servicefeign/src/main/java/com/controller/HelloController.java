package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.service.HelloService;

/**
 * @version V1.0.1
 * @classname HelloController
 * @description:
 * @author: longcong
 * @email: longcong@aliyun.com
 * @date: 2018-11-30  15:29
 **/
@RestController
@RequestMapping("/helloController")
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name) {
        return helloService.SHello(name);
    }

}
