package com.ecjtu.Three;

import java.util.Scanner;

/**
 * Create by czq
 * time on 2019/5/30  21:43
 */
public class StringTest10 {
        public static void main(String[] args) {
        int index = 0;
        String str = "aassswwcddooceffopiuuopueoczmmjhbvv";
        out:
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            for (int j = 0; j < str.length(); j++) {
                if (i != j){
                    char c1 = str.charAt(j);
                    if (c == c1) {
                        index = 0;
                        continue out;
                    } else {
                        if (index++ == str.length() - 1) {
                            System.out.println("最早出现，并且只出现一次的字符为：" + c);
                            break out;
                        }
                        continue;
                    }
                }else {
                    index++;
                }
            }
        }
    }

//    public static void main(String[] args) {
//        String str = "aassswwcddooceffopiuuopueoczmmjhbvv";
//        for (int i = 0; i < str.length(); i++) {
//            char newChar=str.charAt(i);
//            int index = str.indexOf(newChar);
//            int lastindex=str.lastIndexOf(newChar);
//            if(index==lastindex){
//                System.out.println("最早出现，并且只出现一次的字符为：" + newChar);
//                break;
//            }
//        }
//    }
}
