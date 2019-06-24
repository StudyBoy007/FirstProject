package com.ecjtu.MoreApi.ZZBDS;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Create by czq
 * time on 2019/6/6  14:34
 */
public class ZZBDS {
    public static void main(String[] args) {
        juifyEmail();
        zzbdsWork2();
    }

    public static void juifyEmail() {
        String qq = "1045112166@qq.jx.cn1025788012@jx.cn";
        Pattern pattern = Pattern.compile("[a-zA-Z_0-9]+@[a-zA-Z_0-9]+(\\.[a-zA-Z]+)+");
        Matcher m = pattern.matcher(qq);
        while (m.find()){
            System.out.println(m.group());
        }
    }

    public static void zzbdsWork2(){
        String str = "我我....我...我.要...要要...要学....学学..学.编..编编.编.程.程.程..程";
        str = str.replaceAll("\\.+","").replaceAll("(.)\\1+", "$1");//$1取到第一个括号中匹配到的值
        System.out.println(str);
//        String str1="xxy";
//        str1=str1.replaceAll("(.)\\1+(.)\\2?", "$2");
//        System.out.println(str1);
    }
}
