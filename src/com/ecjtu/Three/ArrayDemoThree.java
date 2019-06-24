package com.ecjtu.Three;

import jdk.nashorn.internal.runtime.FindProperty;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Create by czq
 * time on 2019/5/30  10:56
 */
public class ArrayDemoThree {
//    public static void main(String[] args) {
//        int data=35;
//        int[]arr=new int[6];
//        for (int i=0;i<arr.length;i++){
//            arr[i]=data%2;
//            data/=2;
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//        for (int i=arr.length-1;i>=0;i--){
//            System.out.print(arr[i]+" ");
//        }
//    }
public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.print("请输入需要转化为二进制的数字：");
    int number=input.nextInt();
    int temp=number;
    int time=0;
    while (number!=0){
        number/=2;
        time++;
    }
    number=temp;
    int[]arr=new int[time];
    for (int i=0;i<arr.length;i++){
        int y=number%2;
        number/=2;
        arr[i]=y;
    }
    for (int i=arr.length-1;i>=0;i--){
        System.out.print(arr[i]+" ");
    }}
}
