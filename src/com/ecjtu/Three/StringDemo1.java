package com.ecjtu.Three;

/**
 * Create by czq
 * time on 2019/5/30  16:33
 */
public class StringDemo1 {
    public static void main(String[] args) {
        String file = "d://program\\file.java";
        int index = file.lastIndexOf(".");
        String str = file.substring(index);
//        if(str==".java"){
//            System.out.println("是java文件");
//        }else {
//            System.out.println("不是java文件");
//        }
        String str1=".java";
        String str2 = ".java";
        String str3=new String(".java");
        System.out.println(str.hashCode());
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str3.hashCode());
        System.out.println("----------------------");
        System.out.println(str==str1);
        System.out.println(str1==str2);
        System.out.println("----------------------");
        char i='j';
        char j=str1.charAt(1);
        System.out.println(i==j);//true 字符是基本数据类型
    }
}
