package com.ecjtu.Address;

import java.io.*;

/**
 * Create by czq
 * time on 2019/6/18  16:22
 */
public class Work2 {
    public static void main(String[] args) {
       File file= new File("FileTest\\imooc");
        try {
            BufferedReader br;
            br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
//            char[]chars=new char[1024];
//            int a;
//            while ((a=br.read(chars,0,chars.length))!=-1){
//                for (int i=0;i<a;i++){
//                    System.out.print(chars[i]);
//                }
//            }
            String line;
            while ((line=br.readLine())!=null){
                System.out.println(line);
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
