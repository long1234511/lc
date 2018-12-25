package web.com.MQ;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.jms.core.JmsTemplate;

import javax.jms.Destination;

/**
 * @version V1.0.1
 * @classname MqApplication
 * @description:
 * @author: longcong
 * @email: longcong@aliyun.com
 * @date: 2018-12-21  15:07
 **/

@SpringBootApplication
public class MqApplication {
    public static void main(String[] args) {
        SpringApplication.run(MqApplication.class,args);
    }
}
