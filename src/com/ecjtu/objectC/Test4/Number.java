package com.ecjtu.objectC.Test4;

import java.net.SocketTimeoutException;
import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Create by czq
 * time on 2019/5/31  12:28
 */
public class Number {
    public double a;
    public double c;

    public Number(double a, double c) {
        this.a = a;
        this.c = c;
    }

    public void addition() {
        System.out.println("相加为:" + (this.a + this.c));
    }

    public void subtration() {
        System.out.println("相减为:" + (this.a - this.c));
    }

    public void multiplication() {
        System.out.println("相乘为:" + (this.a * this.c));
    }

    public void division() {
        System.out.println("相除为:" + (this.a / this.c));
    }

    public static void main(String[] args) {
        System.out.println("请输入进行运算的两个值:");
        Scanner input = new Scanner(System.in);
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        Number number = new Number(num1, num2);
        System.out.println("请输入想要进行的操作：\n相加：1\n相减：2\n相乘：3\n相除：4");
        int i = input.nextInt();
        switch (i){
            case 1:number.addition();break;
            case 2:number.subtration();break;
            case 3:number.multiplication();break;
            case 4:number.division();break;
            default:
                System.out.println("输入有误");
        }
    }
}
