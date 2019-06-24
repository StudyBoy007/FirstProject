package com.ecjtu.io.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Create by czq
 * time on 2019/6/20  19:01
 */
public class Test6 {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(2);
        array.add(6);
        array.add(4);
        array.add(3);
        array.add(12);
        array.add(4);
        for (int i = 0; i < array.size(); i++) {
            maoPao(array);
        }
        for (Integer a : array) {
            System.out.println(a);
        }
    }

    public static void maoPao(List<Integer> length) {
        int before = length.get(0);
        for (int j = 1; j < length.size(); j++) {
            int after = length.get(j);
            if (before > after) {
                length.set(j, before);
                length.set(j - 1, after);
            } else {
                before = after;
            }
        }
    }
}
