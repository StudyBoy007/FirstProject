package com.ecjtu.Three;

/**
 * Create by czq
 * time on 2019/5/30  20:44
 */
public class StringTest5 {
    public static void main(String[] args) {
        String a = "To be or not to be";
        String[] strs =a.split(" ");
        for (int i=0;i<strs.length;i++){
            StringBuilder sb=new StringBuilder(strs[i]);
            String newstr=sb.reverse().toString();
            strs[i]=newstr;
        }
        for (String str:strs){
            System.out.print(str+" ");
        }
    }
}
