package web.Service;

import web.RPC.HelloServiceImpl;
import web.RPC.SHello;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Method;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @version V1.0.1
 * @classname RPCService
 * @description:
 * @author: longcong
 * @email: longcong@aliyun.com
 * @date: 2018-11-28  17:13
 **/
public class RPCService {
    private SHello sHello = new HelloServiceImpl();

    public void RpcServicesPush(int port){
        try(ServerSocket so  = new ServerSocket(port)){
            while (true){
                Socket accept = so.accept(); //重队列中取出一个连接，如果没有就进行等待
                ObjectInputStream ois = new ObjectInputStream(accept.getInputStream());
                String method = ois.readUTF();
                Object[] objs = (Object[]) ois.readObject();
                Class<?>[] types = new Class[objs.length];
                for (int i = 0; i < types.length; i++) {
                    types[i] = objs[i].getClass();
                }
                Method m = HelloServiceImpl.class.getMethod(method, types);
                Object obj = m.invoke(sHello, objs);

                try (ObjectOutputStream oos = new ObjectOutputStream(accept.getOutputStream())) {
                    oos.writeObject(obj);
                    oos.flush();
                }

            } 

        }catch (Exception e){

        }

    }

}
