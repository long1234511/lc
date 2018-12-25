package web.com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @version V1.0.1
 * @classname application
 * @description:
 * @author: longcong
 * @email: longcong@aliyun.com
 * @date: 2018-09-21  16:18
 **/
@SpringBootApplication
@ComponentScan(basePackages = "web.com")
@EnableTransactionManagement
@MapperScan("web.com.dao")
@EnableScheduling
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}