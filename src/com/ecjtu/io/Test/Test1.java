package com.ecjtu.io.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Create by czq
 * time on 2019/6/19  11:28
 */
public class Test1 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");

        System.out.println("NO.1");
        List<String> list1 = new ArrayList<>(list);
        for (String str : list1) {
            if ("2".equals(str)) {
                list1.remove(str);
            }
        }
        for (String s : list1) {
            System.out.print(s);
        }

//        System.out.println("NO.5");
//        List<String> list5 = new ArrayList<>(list);
//        Iterator<String> iterator = list5.iterator();
//        while (iterator.hasNext()) {
//            String str = iterator.next();
//            if ("2".equals(str)) {
////                list5.remove(str);
//                iterator.remove();
//            }
//        }
//        for (String l : list5) {
//            System.out.println(l);
//        }

    }
}
