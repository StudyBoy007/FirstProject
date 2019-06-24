package com.ecjtu.Three;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Create by czq
 * time on 2019/5/30  10:37
 */
public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入购买的商品数量：");
        int num = input.nextInt();
        double[] money = new double[num];
        for (int i = 0; i < num; i++) {
            System.out.print("请输入第" + (i + 1) + "笔购物金额：");
            double oneMoney=input.nextDouble();
            money[i]=oneMoney;
        }
        System.out.println("序号\t\t\t\t金额(元)");
        double sum=0;
        for (int i=0;i<num;i++){
            System.out.println((i+1)+"\t\t\t\t\t"+money[i]);
            sum+=money[i];
        }
        System.out.println("总金额\t\t\t\t"+sum);
    }
}
