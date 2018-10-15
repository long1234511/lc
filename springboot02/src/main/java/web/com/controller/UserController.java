package web.com.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.applet.Main;
import web.com.entity.User;
import web.com.service.UserService;

/**
 * @author:longcong
 * @email:longcong@aliyun.com
 * @date:2018/5/17 16:15
 * @description: 用户类
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/add")
    public String add(User user){
     String msg = userService.addUser(user);
        return msg;
    }
}
