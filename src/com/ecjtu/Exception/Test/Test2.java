package com.ecjtu.Exception.Test;

import java.util.Scanner;

/**
 * Create by czq
 * time on 2019/6/5  20:23
 */
//
public class Test2 {
    public static void main(String[] args) {
        while (true){
            try {
                int a=10/1;
                break;
            }catch (ArithmeticException e){
                System.out.println(e.getMessage());
            }finally {
                System.out.println("我输出了：");
                System.out.println("我是finally");
                continue;
            }
        }
    }
}
