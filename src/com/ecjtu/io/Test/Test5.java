package com.ecjtu.io.Test;

import java.io.File;

/**
 * Create by czq
 * time on 2019/6/20  16:06
 */
public class Test5 {
    public static void main(String[] args) {
        File file = new File("File");
        System.out.println(file.getAbsolutePath());
        System.out.println(file.length()/1024);
    }
}
