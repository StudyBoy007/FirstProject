package com.ecjtu.Exception.Test;

import com.ecjtu.Exception.Drink.Beer;

/**
 * Create by czq
 * time on 2019/6/5  14:33
 */
public class Test1 {
    public static void main(String[] args) {
        try {
            test();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("你好");
    }
    static void test(){
        int a=5/0;
        System.out.println("我输出了");
    }
}
