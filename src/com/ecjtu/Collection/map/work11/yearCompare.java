package com.ecjtu.Collection.map.work11;

import java.util.Comparator;
import java.util.Map;

/**
 * Create by czq
 * time on 2019/6/24  16:37
 */
public class yearCompare implements Comparator<Map.Entry<Integer, String>> {
    @Override
    public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
        if (o1.getKey() > o2.getKey()) {
            return 1;
        } else if (o1.getKey() < o2.getKey()) {
            return -1;
        } else {
            return 0;
        }
    }

}
