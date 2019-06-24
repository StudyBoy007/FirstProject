package com.ecjtu.io.Test;

import java.io.File;
import java.io.UnsupportedEncodingException;

/**
 * Create by czq
 * time on 2019/6/20  11:31
 */
public class Test4 {
    public static void main(String[] args) {
        String username = "小明";
        try {
            byte[] bytes = username.getBytes("utf-8");
            String str = new String(bytes, "ISO-8859-1");
            System.out.println(str);
            byte[] bytes1 = str.getBytes("ISO-8859-1");
            String s = new String(bytes1, "utf-8");
            System.out.println(s);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
