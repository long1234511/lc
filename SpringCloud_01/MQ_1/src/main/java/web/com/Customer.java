package web.com;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * @version V1.0.1
 * @classname Customer
 * @description:
 * @author: longcong
 * @email: longcong@aliyun.com
 * @date: 2018-12-21  17:34
 **/
@Component
public class Customer {

    @JmsListener(destination = "mytest1")
    public void resviceMessage(String test){
        System.out.println(test);
        System.out.println("11111111111111111111111===11111111111");
    }
}
