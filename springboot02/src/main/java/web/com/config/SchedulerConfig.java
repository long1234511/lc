package web.com.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @version V1.0.1
 * @classname SchedulerConfig
 * @description:
 * @author: longcong
 * @email: longcong@aliyun.com
 * @date: 2018-12-20  15:45
 **/
@Component
public class SchedulerConfig {

    //每分钟启动
    @Scheduled(cron = "*/5 * * * * ?")
    public void timerToNow(){
        System.out.println("now time:" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
    }

}
