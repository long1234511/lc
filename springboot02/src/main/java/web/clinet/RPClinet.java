package web.clinet;

import web.RPC.HelloServiceImpl;
import web.RPC.SHello;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.Socket;

/**
 * @version V1.0.1
 * @classname RPClinet
 * @description:
 * @author: longcong
 * @email: longcong@aliyun.com
 * @date: 2018-11-28  17:43
 **/
public class RPClinet<T> {
    public T proxyClient(Class<T> clazz) {
        return (T) clazz.cast(Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), new InvocationHandler() {

            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                try (Socket socket = new Socket("localhost", 8000)) {
                    try (ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream())) {
                        oos.writeUTF(method.getName());
                        oos.writeObject(args);
                        oos.flush();

                        try (ObjectInputStream ois = new ObjectInputStream(socket.getInputStream())) {
                            return ois.readObject();
                        }
                    }
                }
            }
        }));
    }


}
