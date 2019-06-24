package com.ecjtu.io.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Create by czq
 * time on 2019/6/19  16:53
 */
public class Test3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("2");
        list.add("3");
        list.remove("2");
        for (String s:list){
            System.out.println(s);
        }
    }
}
