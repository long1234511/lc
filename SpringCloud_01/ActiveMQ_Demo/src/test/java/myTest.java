import org.apache.activemq.command.ActiveMQQueue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import web.com.MQ.MqApplication;
import web.com.MQ.config.Product;

import javax.jms.Destination;

/**
 * @version V1.0.1
 * @classname myTest
 * @description:
 * @author: longcong
 * @email: longcong@aliyun.com
 * @date: 2018-12-21  17:52
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MqApplication.class)
public class myTest {

    @Autowired
    private Product product;

    @Test
    public void test1(){
        Destination destination = new ActiveMQQueue("mytest1");

        for(int i=0; i<100; i++) {
            product.sendMessage(destination, "1111111!");
        }
    }
}
