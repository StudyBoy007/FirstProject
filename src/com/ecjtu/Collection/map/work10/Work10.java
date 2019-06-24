package com.ecjtu.Collection.map.work10;

import java.util.HashSet;
import java.util.TreeSet;

/**
 * Create by czq
 * time on 2019/6/24  15:49
 */
public class Work10 {
    public static void main(String[] args) {
        HashSet<Worker> set = new HashSet<>();
        set.add(new Worker("李飞", 18, 20000));
        set.add(new Worker("蔡泽球", 20, 20000));
        set.add(new Worker("刘梦昊", 20, 15000));
        TreeSet<Worker> treeSet = new TreeSet<>();
        for (Worker worker : set) {
            treeSet.add(worker);
        }
        for (Worker worker : treeSet) {
            System.out.println(worker.name + "\t" + worker.age + "\t" + worker.salary);
        }
    }
}
