package web.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version V1.0.1
 * @classname HelloController
 * @description:
 * @author: longcong
 * @email: longcong@aliyun.com
 * @date: 2018-11-30  15:27
 **/
@RestController
@RequestMapping(value = "/hello")
public class HelloController {

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String SHello(@RequestParam(value = "name") String name){
        String s = "Hello , " + name;
        return s;
    }
}
