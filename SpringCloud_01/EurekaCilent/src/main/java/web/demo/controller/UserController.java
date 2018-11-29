package web.demo.controller;

import com.sun.org.apache.regexp.internal.REUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import web.demo.domain.User;

/**
 * @version V1.0.1
 * @classname UserController
 * @description:
 * @author: longcong
 * @email: longcong@aliyun.com
 * @date: 2018-11-29  15:18
 **/
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @RequestMapping(value = "/data")
    public User getUser(@RequestParam Integer age){
        User user = new User();
            user.setAge(age);
            user.setId(1);
            user.setName("zs");
        return user;
    }
}
