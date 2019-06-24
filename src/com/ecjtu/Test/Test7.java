package com.ecjtu.Test;

import java.math.BigInteger;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

/**
 * Create by czq
 * time on 2019/6/6  8:29
 */
public class Test7 {
    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(date);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int[] field =new int[5];

        field[Calendar.YEAR]=1998;


        Date date1 = new Date(System.currentTimeMillis());
        System.out.println(date1);
    }
}
