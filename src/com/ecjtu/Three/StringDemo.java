package com.ecjtu.Three;

/**
 * Create by czq
 * time on 2019/5/30  16:10
 */
public class StringDemo {
    public static void main(String[] args) {
        String s="a"+"b"+"c";
        String s1="a"+"b"+"c";
        System.out.println(s==s1);//true
        System.out.println(s=="abc");//true
        String s2="a";
        String s3=s2+"b";
        String s4="a"+"b";
        System.out.println(s3=="ab");//false
        System.out.println(s4=="ab");//true
    }
}
