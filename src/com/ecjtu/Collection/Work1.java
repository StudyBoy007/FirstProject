package com.ecjtu.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Create by czq
 * time on 2019/6/21  10:40
 */
public class Work1 {
    public static void main(String[] args) {
        String[] strings1 = {"a", "b", "c", "d", "e"};
        String[] strings2 = {"d", "e", "f", "g", "h"};
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        for (String s : strings1) {
            list1.add(s);
        }
        for (String s : strings2) {
            list2.add(s);
        }

        //1.0
//        for (int i = 0; i < list1.size(); i++) {
//            for (int j = 0; j < list2.size(); j++) {
//                if (list1.get(i).equals(list2.get(j))) {
//                    list2.remove(j);
//                }
//            }
//        }
//        list1.addAll(list2);

        //2.0
        for (String s : list2) {
            if (!list1.contains(s)) {
                list1.add(s);
            }
        }

        for (String s : list1) {
            System.out.print(s + "  ");
        }

    }
}
