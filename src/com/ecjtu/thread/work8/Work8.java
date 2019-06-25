package com.ecjtu.thread.work8;

import java.util.Scanner;

/**
 * Create by czq
 * time on 2019/6/25  15:07
 */
public class Work8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个时间：");
        int time = input.nextInt();
        SubThread thread = new SubThread("阿飞线程", time);
        thread.start();
    }
}
