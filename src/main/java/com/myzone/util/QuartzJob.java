package com.myzone.util;

import java.text.SimpleDateFormat;
import java.util.Locale;

/**
 * Created by 陈 on 2017/7/11.
 */
public class QuartzJob {
    public void work() {
        String time = new SimpleDateFormat("MMM d，yyyy KK:mm:ss a", Locale.ENGLISH).format(System.currentTimeMillis());
        System.out.println("time:"+time);
    }
}
