package com.ecjtu.io.Work;

import java.io.*;
import java.util.*;

/**
 * Create by czq
 * time on 2019/6/19  10:50
 */
public class Work1 {
    public static void main(String[] args) {
        List<Character> charList = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("File\\a.txt")));
            PrintWriter pw = new PrintWriter(new FileOutputStream("File\\b.txt"));
            int ii;
            while ((ii = br.read()) != -1) {
                charList.add((char) ii);
            }
            Collections.sort(charList);
            for (int i = 0; i < charList.size(); i++) {
                boolean flag = true;
                for (int j = 0; j < charList.size(); j++) {
                    if (i == j) {
                        continue;
                    }
                    char c1 = charList.get(i);
                    char c2 = charList.get(j);
                    if (c1 == c2) {
                        charList.remove(j);
                        flag = false;
                    }
                }
                if (flag == false) {
                    charList.remove(i);
                }
            }
            for (Character c : charList) {
                pw.write(c);
            }
            pw.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
