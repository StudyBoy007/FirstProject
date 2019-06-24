package com.ecjtu.Three;

/**
 * Create by czq
 * time on 2019/5/30  20:59
 */
public class StringTest7 {
    public static void main(String[] args) {
        String str = "IhLeOllVoEwJorAlVdA";
        String newstr1 = new String();
        StringBuilder sb1=new StringBuilder(newstr1);
        String newstr2 = new String();
        StringBuilder sb2=new StringBuilder(newstr2);
        System.out.println(newstr1);
        char[] charSmall = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char[] charBig = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V','W', 'X', 'Y', 'Z'};
        out:
        for (int i=0;i<str.length();i++){
            char newChar=str.charAt(i);
            for (char c:charSmall){
                if(newChar==c){
                    sb2.append(newChar);
                    continue out;
                }
            }
            for (char c:charBig){
                if(newChar==c){
                    sb1.append(newChar);
                    continue out;
                }
            }
        }
        newstr1=sb1.toString();
        newstr2=sb2.toString();
        System.out.println("该字符串大写字母按顺序组成的字符串为："+newstr1);
        System.out.println("该字符串小写字母按顺序组成的字符串为："+newstr2);
        System.out.println(newstr1.toLowerCase());
        System.out.println(newstr2.toUpperCase());
        StringBuilder stringBuilder=new StringBuilder(str);
        String newStr=stringBuilder.reverse().toString();
        System.out.println(newStr);
    }
}
