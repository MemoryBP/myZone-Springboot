package com.myzone.util;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;

/**
 * Created by 陈 on 2017/7/11.
 */
@Component
public class QuartzJob {
    @Scheduled(cron="0 0 12 ? * *")
    public void eatLunch() {
        /*String time = new SimpleDateFormat("MMM d，yyyy KK:mm:ss a", Locale.ENGLISH).format(System.currentTimeMillis());*/
        String time = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(System.currentTimeMillis());
        System.out.println("time:"+time);
        System.out.println("吃饭啦!!!!!!!!!!!");
    }

    @Scheduled(cron="0 0 13 ? * *")
    public void workAfternoon() {
        /*String time = new SimpleDateFormat("MMM d，yyyy KK:mm:ss a", Locale.ENGLISH).format(System.currentTimeMillis());*/
        String time = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(System.currentTimeMillis());
        System.out.println("time:"+time);
        System.out.println("中午上班啦!!!!!!!!!!!");
    }

    @Scheduled(cron="0 0 17 ? * *")
    public void goHome() {
        /*String time = new SimpleDateFormat("MMM d，yyyy KK:mm:ss a", Locale.ENGLISH).format(System.currentTimeMillis());*/
        String time = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(System.currentTimeMillis());
        System.out.println("time:"+time);
        System.out.println("下班啦!!!!!!!!!!!");
    }

    @Scheduled(cron="0 10 18 ? * *")
    public void goneHome() {
        /*String time = new SimpleDateFormat("MMM d，yyyy KK:mm:ss a", Locale.ENGLISH).format(System.currentTimeMillis());*/
        String time = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(System.currentTimeMillis());
        System.out.println("time:"+time);
        System.out.println("到家啦!!!!!!!!!!!");
    }

}
