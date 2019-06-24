package com.ecjtu.io.daytwo;

import java.io.*;

/**
 * Create by czq
 * time on 2019/6/20  16:28
 */
public class Work6 {
    public static void main(String[] args) {
        File file = new File("File\\imooc");
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            String info;
            int num=0;
            while ((info=br.readLine())!=null){
                System.out.println(++num+".\t"+info);
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
