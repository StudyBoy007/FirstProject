package com.ecjtu.io.daytwo;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * Create by czq
 * time on 2019/6/20  16:30
 */
public class Work7 {
    public static void main(String[] args) {
        File file = new File("D:");
        fileSize(file);
    }

    public static void nameUp(File file) {
        File[] files = file.listFiles();
        System.out.println(files.length);
        List<String> names = new ArrayList<>();
        for (File f : files) {
            names.add(f.getName());
        }
        Collections.sort(names);
        for (String s : names) {
            System.out.println(s);
        }
    }

    public static void nameDown(File file) {
        File[] files = file.listFiles();
        System.out.println(files.length);
        List<String> names = new ArrayList<>();
        for (File f : files) {
            names.add(f.getName());
        }
        Collections.sort(names);
        Collections.reverse(names);
        for (String s : names) {
            System.out.println(s);
        }
    }

    public static void dirbefore(File file) {
        File[] files = file.listFiles();
        List<File> names = new ArrayList<>();
        for (File f : files) {
            names.add(f);
        }

        int num = 0;
        for (int i = 0; i < names.size(); i++) {
            File f = names.get(i);
            if (f.isDirectory()) {
                names.remove(i);
                names.add(num++, f);
            }
        }
        for (File f : names) {
            System.out.println(f.getName());
        }
    }

    public static void dirAfter(File file) {
        File[] files = file.listFiles();
        List<File> names = new ArrayList<>();
        for (File f : files) {
            names.add(f);
        }

        int num = 0;
        for (int i = 0; i < names.size(); i++) {
            File f = names.get(i);
            if (f.isDirectory()) {
                names.remove(i);
                names.add(num++, f);
            }
        }
        Collections.reverse(names);
        for (File f : names) {
            System.out.println(f.getName());
        }
    }

    public static void fileSize(File file) {
        File[] files = file.listFiles();
        List<Long> filel = new ArrayList<>();
        List<File> names = new ArrayList<>();
        for (File f : files) {
            filel.add(f.length());
            names.add(f);
        }

        System.out.println();
        for (int i = 0; i < filel.size(); i++) {
            maoPao(filel);
        }
        for (Long l : filel) {
            for (int i = 0; i < names.size(); i++) {
                if (names.get(i).length() == l) {
                    System.out.println(names.get(i).getName());
                    names.remove(i);
                    break;
                }
            }
        }
    }

    public static void maoPao(List<Long> length) {
        long before = length.get(0);
        for (int j = 1; j < length.size(); j++) {
            Long after = length.get(j);
            if (before > after) {
                length.set(j, before);
                length.set(j - 1, after);
            } else {
                before = after;
            }
        }
    }
}
