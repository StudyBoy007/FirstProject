package com.ecjtu.io.File;

import java.io.File;
import java.io.IOException;

/**
 * Create by czq
 * time on 2019/6/19  9:11
 */
public class FileTest {
    public static void main(String[] args) {
        Runtime runtime=Runtime.getRuntime();
        File file = new File("C:\\Windows\\System32", "control.exe");
        try {
            Process process = runtime.exec(file.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
