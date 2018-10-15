package web.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import web.com.entity.User;

/**
 * @version V1.0.1
 * @classname LoginController
 * @description:
 * @author: longcong
 * @email: longcong@aliyun.com
 * @date: 2018-09-26  16:14
 **/
@Controller
public class LoginController {

    @RequestMapping(value = "/login")
    public String Login(User user){

        return "redirect:login.html";
    }
    @RequestMapping(value = "/logout")
    public String Logout(){
        return "redirect：login.html";
    }
}
