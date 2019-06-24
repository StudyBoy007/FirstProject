package com.ecjtu.io.daytwo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Create by czq
 * time on 2019/6/20  14:24
 */
public class Work3 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("File\\imooc")));
            String info;
            while ((info=br.readLine())!=null){
                System.out.println(info);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
