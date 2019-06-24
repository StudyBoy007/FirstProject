package com.ecjtu.Collection.Work4;

import java.util.Comparator;
import java.util.Map;

/**
 * Create by czq
 * time on 2019/6/21  14:28
 */
public class idCompare implements Comparator<Map.Entry<Integer, Student>> {
    @Override
    public int compare(Map.Entry<Integer, Student> o1, Map.Entry<Integer, Student> o2) {
        if (o1.getValue().id > o2.getValue().id) {
            return -1;
        } else if (o1.getValue().id < o2.getValue().id) {
            return 1;
        } else {
            return 0;
        }
    }
}
