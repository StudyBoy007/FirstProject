package com.ecjtu.Three;

/**
 * Create by czq
 * time on 2019/5/30  21:21
 */
public class StringTest8 {
    public static void main(String[] args) {
        String str="The last French hostage held by Islamist militants, Serge Lazarevic";
        char c='s';
        int count=0;
        for (int i=0;i<str.length();i++){
            char newChar=str.charAt(i);
            if(c==newChar){
                count++;
            }
        }
        System.out.println("字符"+c+"出现的次数为："+count);
        String strs[]=str.split(" ");
        System.out.println(strs[3]);
        for (int i=0;i<strs.length;i++){
            String str2=strs[i].substring(1);
            String str3=Character.toUpperCase(strs[i].charAt(0))+str2;
            System.out.print(str3+" ");
        }
    }
}
