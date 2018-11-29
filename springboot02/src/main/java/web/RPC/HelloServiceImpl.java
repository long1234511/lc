package web.RPC;

/**
 * @version V1.0.1
 * @classname HelloServiceImpl
 * @description:
 * @author: longcong
 * @email: longcong@aliyun.com
 * @date: 2018-11-28  17:11
 **/
public class HelloServiceImpl implements SHello {

    @Override
    public String sayHello(String say) {
        String hello = "Hello" + say;
        System.out.println(hello);
        return hello;
    }
}
