package com.ecjtu.Collection;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Create by czq
 * time on 2019/6/21  16:59
 */
public class Work5 {
    public static void main(String[] args) {
        int num = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            do {
                do {
                    num = (int) (Math.random() * 51);
                } while (num % 2 != 0);
            } while (list.contains(num));
            list.add(num);
        }
        Collections.sort(list);
        //
        Collections.reverse(list);
        StringBuilder sb = new StringBuilder();
        for (Integer i : list) {
            sb.append(i + ",");
        }
        System.out.println(sb);
        try {
            PrintWriter pw = new PrintWriter(new FileOutputStream("File\\num.txt"));
            pw.write(sb.toString());
            pw.flush();
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
