package com.ecjtu.io.daytwo;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Create by czq
 * time on 2019/6/20  14:17
 */
public class Work2 {
    public static void main(String[] args) {
        File file = new File("F:\\idea\\workspace\\CXXM\\FirstProject");
        javaFile(file);
    }

    public static void javaFile(File file) {
        File[] javaFiles = file.listFiles(new javaFilter("java"));
        for (File f:javaFiles){
            System.out.println(f);
        }
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isDirectory()) {
                javaFile(f);
            }
        }
    }
}

class javaFilter implements FilenameFilter {
    String suffix;

    public javaFilter(String suffix) {
        this.suffix = "." + suffix;
    }

    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(suffix);
    }
}
