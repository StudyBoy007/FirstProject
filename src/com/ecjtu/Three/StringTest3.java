package com.ecjtu.Three;

import java.util.Scanner;

/**
 * Create by czq
 * time on 2019/5/30  20:33
 */
public class StringTest3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("请输入一个字符串:");
        String str=input.next();
        juify(str);
    }
    static void juify(String str){
        StringBuilder sb=new StringBuilder(str);
        String str1=sb.reverse().toString();
        if(str1.equals(str)){
            System.out.println("该字符串对称");
        }else {
            System.out.println("该字符串不对称");
        }
    }
}
