package com.ecjtu.Three;

/**
 * Create by czq
 * time on 2019/5/30  21:38
 */
public class StringTest9 {
    public static void main(String[] args) {
        String str="as well as other constants and methods";
        String[]strs=str.split(" ");
        System.out.println("总共有单词："+strs.length+"个");
        String maxWorld=strs[0];
        for (int i=0;i<strs.length;i++){
            if(maxWorld.length()<strs[i].length()){
                maxWorld=strs[i];
            }
        }
        System.out.println("最长的单词为："+maxWorld);
    }
}
