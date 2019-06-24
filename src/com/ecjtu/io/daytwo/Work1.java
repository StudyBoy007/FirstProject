package com.ecjtu.io.daytwo;

import java.io.*;
import java.lang.reflect.Field;

/**
 * Create by czq
 * time on 2019/6/20  11:13
 */
public class Work1 {
    public static void main(String[] args) {
        File file = new File("daytwo\\HelloWorld.txt");
        System.out.println("该路径下是目录：" + file.isDirectory());
        System.out.println("该路径下是文件：" + file.isFile());
        File file1 = new File("daytwo\\IOTest");
        if (!file1.exists()) {
            file1.mkdirs();
        }
        System.out.println(file.getName());
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            PrintWriter pw = new PrintWriter(new FileOutputStream("daytwo\\IOTest\\" + file.getName()));
            String line;
            while ((line = br.readLine()) != null) {
                pw.write(line);
                pw.flush();
            }
            pw.close();
            br.close();
            file.delete();
            File[] files = file1.listFiles();
            for (File f:files){
                System.out.println(f);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
