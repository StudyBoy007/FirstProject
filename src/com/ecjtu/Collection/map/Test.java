package com.ecjtu.Collection.map;

import java.util.HashSet;
import java.util.Set;

/**
 * Create by czq
 * time on 2019/6/24  14:54
 */
public class Test {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(3);
        set.add(2);
        set.add(7);
        for (Integer s:set){
            System.out.println(s);
        }

//        Set<String> set = new HashSet<>();
//        set.add("String1");
//        set.add("String4");
//        set.add("String3");
//        set.add("String2");
//        for (String s : set) {
//            System.out.println(s);
//        }
    }
}
