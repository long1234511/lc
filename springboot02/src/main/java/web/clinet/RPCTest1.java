package web.clinet;

import web.RPC.HelloServiceImpl;
import web.RPC.SHello;

/**
 * @version V1.0.1
 * @classname RPCTest1
 * @description:
 * @author: longcong
 * @email: longcong@aliyun.com
 * @date: 2018-11-28  17:50
 **/
public class RPCTest1 {
    public static void main(String[] args) {
        RPClinet<HelloServiceImpl> rpClinet = new RPClinet<HelloServiceImpl>();
        SHello hello = rpClinet.proxyClient(HelloServiceImpl.class);
        String s = hello.sayHello("dd");
        System.out.println(s);
    }
}
