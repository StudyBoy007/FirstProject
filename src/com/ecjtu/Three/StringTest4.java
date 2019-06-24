package com.ecjtu.Three;

/**
 * Create by czq
 * time on 2019/5/30  20:39
 */
public class StringTest4 {
    public static void main(String[] args) {
        String s = "113@ ere qqq yyui";
        int index=s.indexOf('@');
        String s1=s.replace("@", "");
        String[]strs=s1.split(" ");
        for (String str:strs){
            System.out.println(str);
        }
    }
}
