package com.ecjtu.Three;

/**
 * Create by czq
 * time on 2019/5/30  20:25
 */
public class StringTest1 {
    public static void main(String[] args) {
        String str="jdk";
        String str1=str.toUpperCase();
        System.out.println(str1);
        String str2=str1.substring(str1.indexOf('D'));
        System.out.println(str2);
    }
}
