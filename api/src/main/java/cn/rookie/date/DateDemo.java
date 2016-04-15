package cn.rookie.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Rookie on 2016/4/13.
 * Description:
 * Project_name: Algorithm
 * Copyright (c) All Rights Reserved.
 */
public class DateDemo {

    /**
     * 格式化输出时间
     */
    public static void FormatDate() {
        Date date = new Date();
        System.out.println(date);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd 小时: HH 分钟: mm");
        String s = simpleDateFormat.format(date);
        System.out.println(s);

        Date date1 = null;
        try {
            date1 = simpleDateFormat.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println(date1);
    }

    public static void printCalendar() {

        Calendar calendar = Calendar.getInstance();
        System.out.println("年 : " + calendar.get(1));
        for (int i =0 ;i <17; i++) {
            System.out.println(calendar.get(i));
        }
    }

    public static void main(String[] args) {
        DateDemo.FormatDate();
        DateDemo.printCalendar();
    }
}
