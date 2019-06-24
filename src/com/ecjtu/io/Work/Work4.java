package com.ecjtu.io.Work;

import sun.java2d.pipe.SpanIterator;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

/**
 * Create by czq
 * time on 2019/6/19  16:48
 */
public class Work4 {
    public static void main(String[] args) {
        File file = new File("File\\work4.txt");
        System.out.println("请输入浏览文件的密码:");
        Scanner input = new Scanner(System.in);
        String password = input.next();
        if ("1234".equals(password)) {
            System.out.println("密码正确！！");
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
                String line;
                List<String> list = new ArrayList<>();
                while ((line = br.readLine()) != null) {
                    list.add(line);
                }
                StringBuilder sb = new StringBuilder();
                StringBuilder sb1 = new StringBuilder();
                for (String str : list) {
                    sb.append(str.trim());
                }
                System.out.println(sb);
                HashSet<Character> set = new HashSet<>();
                for (int i = 0; i < sb.length(); i++) {
                    char c = sb.charAt(i);
                    set.add(c);
                }
                for (Character c : set) {
                    int num = 0;
                    for (int i = 0; i < sb.length(); i++) {
                        if (c == sb.charAt(i)) {
                            num++;
                        }
                    }
                    sb1.append(c + ":" + num + "个;");
                }
                PrintWriter pw = new PrintWriter(new FileOutputStream("File\\count.txt"));
                pw.write(sb1.toString());
                pw.close();
                br.close();

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("密码错误！");
        }
    }
}
