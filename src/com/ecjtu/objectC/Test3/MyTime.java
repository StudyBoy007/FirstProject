package com.ecjtu.objectC.Test3;

import javax.xml.ws.soap.Addressing;
import java.sql.Time;

/**
 * Create by czq
 * time on 2019/5/31  10:41
 */
public class MyTime {
    private int hour;
    private int minute;
    private int second;

    public MyTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    void addSecond(int second) {
        if (this.second + second <= 60) {
            this.second = this.second + second;
        } else {
            this.minute += 1;
            this.second = this.second + second - 60;
        }
        display();
    }

    void subSecond(int second) {
        if (this.second - second >= 0) {
            this.second = this.second - second;
        } else {
            this.minute = this.minute - 1;
            this.second = 60+(this.second -second);
        }
        display();
    }

    void addMinute(int minute) {
        if (this.minute + minute <= 60) {
            this.minute = this.minute + minute;
        } else {
            this.hour = this.hour + 1;
            this.minute = this.minute + minute - 60;
        }
        display();
    }

    void subMinute(int minute) {
        if (this.minute - minute >= 0) {
            this.minute = this.minute - minute;
        } else {
            this.hour = this.hour - 1;
            this.minute = 60 +(this.minute-minute);
        }
        display();
    }

    void addHour(int hour) {
        if (this.hour+hour<=12) {
            this.hour = this.hour + hour;
        }else {
            this.hour=this.hour-12;
        }
        display();
    }

    void subHour(int hour) {
        if (this.hour-hour>=0) {
            this.hour = this.hour - hour;
        }else {
            this.hour=12+(this.hour-hour);
        }
        display();
    }

    void display() {
        System.out.println("目前时间为：" + this.hour + "时" + this.minute + "分" + this.second + "秒" + "(" + this.hour + ":" + this.minute + ":" + this.second + ")");
    }

    public static void main(String[] args) {
        MyTime timeNow = new MyTime(10, 15, 10);
        timeNow.display();
        timeNow.subMinute(50);
        timeNow.addSecond(70);
        timeNow.addHour(1);

    }
}
