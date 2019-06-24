package com.ecjtu.io.daytwo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

/**
 * Create by czq
 * time on 2019/6/20  14:30
 */
public class Work4 {
    public static void main(String[] args) {
        try {
            PrintWriter pw = new PrintWriter(new FileOutputStream("File\\Hello.txt"));
            pw.write("HelloJavaWorld你好世界");
            pw.flush();
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
