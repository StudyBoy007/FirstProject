package com.ecjtu.reflect.rflt;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Proxy;
import java.util.Properties;

/**
 * Create by czq
 * time on 2019/6/27  22:13
 */
public class Main {

    static Pay pay;

    static {
        Properties properties = new Properties();
        try {
            properties.load(new FileReader("D:/payMethod.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        String payMethod = properties.getProperty("payMethod");
        try {
            pay = (Pay) Class.forName(payMethod).newInstance();
            pay = (Pay) Proxy.newProxyInstance(pay.getClass().getClassLoader(),
                    pay.getClass().getInterfaces(), new LogHandler(pay));
        } catch (ReflectiveOperationException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        System.out.println(pay.getClass());//会显示是一个代理Proxy类型
        doService(pay);
    }


    //    付钱的
    private static void doService(Pay pay) {
        pay.pay();

        pay.undo();
    }


}
