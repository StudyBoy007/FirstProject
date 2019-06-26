package com.ecjtu.thread.daytwo.Work1;

import java.util.ArrayList;
import java.util.List;

/**
 * Create by czq
 * time on 2019/6/26  14:00
 */
public class TestMain {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("啊一");
        list.add("啊二");
        list.add("啊三");
        list.add("啊四");
        list.add("啊五");
        list.add("啊六");
        list.add("啊七");
        list.add("啊八");
        list.add("啊九");
        list.add("啊十");
        Cave cave = new Cave();
        for (String s : list) {
            new Thread(cave, s).start();
        }
    }
}
