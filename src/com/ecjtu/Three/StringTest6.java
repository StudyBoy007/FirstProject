package com.ecjtu.Three;

/**
 * Create by czq
 * time on 2019/5/30  20:54
 */
public class StringTest6 {
    public static void main(String[] args) {
        String s="name=zhangsan age=18 classNo=090728";
        String[]strs=s.split(" ");
        for (String str:strs){
            String[]str1=str.split("=");
            System.out.print(str1[1]+" ");
        }
    }
}
