package com.ecjtu.io.daytwo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Create by czq
 * time on 2019/6/20  14:32
 */
public class Work5 {

    public static void main(String[] args) {
        try {
            RandomAccessFile raf = new RandomAccessFile("File\\Hello.txt", "rw");
            int size = (int) raf.length();
            while (size > 0) {
                size--;
                raf.seek(size);
                int b = raf.readByte();//带符号的一个字节
//                int b = raf.read();
                if (b >= 0 && b <= 255) {
                    System.out.print((char) b);
                } else {
                    size -= 2;
                    raf.seek(size);
                    byte[] bytes = new byte[3];
                    raf.read(bytes);
                    String s = new String(bytes);
                    System.out.print(s);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
