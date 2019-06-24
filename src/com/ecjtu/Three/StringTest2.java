package com.ecjtu.Three;

/**
 * Create by czq
 * time on 2019/5/30  20:29
 */
public class StringTest2 {
    public static void main(String[] args) {
        String str="Test";
        StringBuffer sb=new StringBuffer(str);
        String str1= sb.reverse().toString();
        System.out.println(str1);
    }
}
