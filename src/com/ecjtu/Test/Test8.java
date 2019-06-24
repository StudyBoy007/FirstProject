package com.ecjtu.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Create by czq
 * time on 2019/6/21  17:52
 */
public class Test8 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("1");
        strings.add("2");
        strings.add("3");
        strings.add("4");
        String[] str = new String[strings.size()];
        String[] strings1 = strings.toArray(str);
    }
}
