package com.ecjtu.objectC.Test1;

import java.util.Scanner;

/**
 * Create by czq
 * time on 2019/5/31  10:09
 */
public class AJuify {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入比较的数值：");
        int num = input.nextInt();
        if (num > A.number) {
            System.out.println("猜大了！！");
        } else if (num == A.number) {
            System.out.println("猜中了！！");
        } else {
            System.out.println("猜小了！！");
        }

    }
}
class A {
    public static int number = 100;
}
