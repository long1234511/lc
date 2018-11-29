package web.RPC;

import web.Service.RPCService;
import web.clinet.RPClinet;

/**
 * @version V1.0.1
 * @classname RPCTest
 * @description:
 * @author: longcong
 * @email: longcong@aliyun.com
 * @date: 2018-11-28  17:45
 **/
public class RPCTest {
    public static void main(String[] args) {
        RPCService server = new RPCService();
        server.RpcServicesPush(8000);
    }
}
