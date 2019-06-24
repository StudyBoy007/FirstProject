package com.ecjtu.io.Work;

import java.io.*;
import java.util.Scanner;

/**
 * Create by czq
 * time on 2019/6/19  17:29
 */
public class Work5 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("File\\imooc")));
            String line;
            StringBuilder sb = new StringBuilder();
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
            System.out.println(sb);
            System.out.println("请输入指定文字，系统来查看文件中出现的次数！");
            Scanner input = new Scanner(System.in);
            String next = input.next();
            int num = 0;
            for (int i = 0; i < sb.length(); i++) {
                if (next.equals(String.valueOf(sb.charAt(i)))) {
                    num++;
                }
            }
            System.out.println(num);
            String newStr = next + "=" + num;
            PrintWriter pw = new PrintWriter(new FileOutputStream("File\\key.txt"));
            pw.write(newStr);
            pw.close();
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
