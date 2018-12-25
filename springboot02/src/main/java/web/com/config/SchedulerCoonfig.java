package web.com.config;

import org.springframework.scheduling.annotation.Scheduled;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @version V1.0.1
 * @classname SchedulerCoonfig
 * @description:
 * @author: longcong
 * @email: longcong@aliyun.com
 * @date: 2018-12-20  16:11
 **/
public class SchedulerCoonfig {

    private static final String CRON_DATE_FORMAT = "ss mm HH dd MM ? yyyy";

    /***
     *
     * @param date 时间
     * @return  cron类型的日期
     */
    public static String getCron(final Date date){
        SimpleDateFormat sdf = new SimpleDateFormat(CRON_DATE_FORMAT);
        String formatTimeStr = "";
        if (date != null) {
            formatTimeStr = sdf.format(date);
        }
        return formatTimeStr;
    }

    /***
     *
     * @param cron Quartz cron的类型的日期
     * @return  Date日期
     */

    public static Date getDate(final String cron) {


        if(cron == null) {
            return null;
        }

        SimpleDateFormat sdf = new SimpleDateFormat(CRON_DATE_FORMAT);
        Date date = null;
        try {
            date = sdf.parse(cron);
        } catch (ParseException e) {
            return null;// 此处缺少异常处理,自己根据需要添加
        }
        return date;
    }

    public static String getCronByString(String date){
        String s = date.replaceAll(":", " ");
        SimpleDateFormat formatter = new SimpleDateFormat("HH mm ss");
        try {
            Date parse = formatter.parse(s);
            SimpleDateFormat format = new SimpleDateFormat("ss mm HH");
            s = format.format(parse)+" * * ?";
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return s;
    }

    public static void main(String[] args) {

        /*String s = new Date().toString();
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("06:00:-");
        String format = simpleDateFormat.format(date);*/
        String msc = "00:01:00";
        String cronByString = SchedulerCoonfig.getCronByString(msc);
        System.out.println(cronByString);
       // System.out.println(format);
    /*    String cron = SchedulerCoonfig.getCron(ne);
        System.out.println(cron);*/
    }

}
