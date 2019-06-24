package com.ecjtu.MoreApi.SaveDates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * Create by czq
 * time on 2019/6/6  10:33
 */
public class SaveDates {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
//        String str=getTimeDeffer("1998-5-6 16:11:00");
//        System.out.println(str);
//        yesterday(); //昨天这个时刻的方法
//        System.out.println("-----------------------------------");
//        juifyYear();//判断输入的年份是闰年还是平年
//        System.out.println("-----------------------------------");
//        String days = getTimeDeffer("1998-1-14 19:6:40");//计算自己活了多少天
//        System.out.println(days);
//        System.out.println("-----------------------------------");
//        String days1 = getTimeDeffer("2019-6-20 19:6:40");//计算还有多久上班
//        System.out.println(days1);
        test();
    }

    //判断闰年
    public static void juifyYear() {
        System.out.println("输入年份:");
        input = new Scanner(System.in);
        System.out.print("年份：");
        int i = input.nextInt();
        if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
            System.out.println("该年为闰年,二月份有29天");
        } else {
            System.out.println("该年为平年,二月份有28天");
        }
    }

    /**
     * 获取时间差
     *
     * @param time1 time2 需要计算的时间
     * @return
     */
    public static String getTimeDeffer(String time1) {
        String result = "";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            long dt1 = sdf.parse(time1).getTime();
            long dt2 = new Date().getTime();
            long seconds = Math.abs(dt2 - dt1) / 1000;
            long date = seconds / (24 * 60 * 60);     //相差的天数
            long hour = (seconds - date * 24 * 60 * 60) / (60 * 60);//相差的小时数
            long minut = (seconds - date * 24 * 60 * 60 - hour * 60 * 60) / (60);//相差的分钟数
            long second = (seconds - date * 24 * 60 * 60 - hour * 60 * 60 - minut * 60);//相差的秒数
            return (date == 0 ? "" : (date + "天")) + (hour == 0 ? "" : (hour + "小时")) + (minut == 0 ? "" : (minut + "分")) + (second == 0 ? "" : (second + "秒"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static void yesterday() {
        Date date = new Date();
        long secondsss = date.getTime() - 1000 * 60 * 60 * 24;
        Date date1 = new Date(secondsss);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String yes = simpleDateFormat.format(date1);
        System.out.println(yes);
    }

    public static void test() {
        Calendar calendar=Calendar.getInstance();
        System.out.println(calendar.getTimeInMillis());
        Date date = new Date();
        System.out.println(date.getTime());
    }
}
