package com.ecjtu.Collection.map.work15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/**
 * Create by czq
 * time on 2019/6/24  19:45
 */
public class Work15 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList();
        list.add(new Student("Tom", 18, 100, "class05"));
        list.add(new Student("Jerry", 22, 70, "class04"));
        list.add(new Student("Owen", 25, 90, "class05"));
        list.add(new Student("Jim", 30, 80, "class05"));
        list.add(new Student("Steve", 28, 66, "class06"));
        list.add(new Student("Kevin", 24, 100, "class04"));
        list.add(new Student("Steve", 28, 80, "class01"));
        list.add(new Student("Kevin", 24, 80, "class01"));
        int sum = 0;
        for (Student student : list) {
            sum += student.getAge();
        }
        System.out.println("学生的平均年龄为：" + sum / list.size());
        HashMap<String, List<Double>> hashMap = new HashMap<>();
        for (Student student : list) {
            if (hashMap.containsKey(student.getClassName())) {
                hashMap.get(student.getClassName()).add(student.getScore());
            } else {
                List<Double> Scores = new ArrayList<>();
                hashMap.put(student.getClassName(), Scores);
                hashMap.get(student.getClassName()).add(student.getScore());
            }
        }
        Set<String> classes = hashMap.keySet();
        for (String aClass : classes) {
            List<Double> scores = hashMap.get(aClass);
            int total = 0;
            for (Double score : scores) {
                total += score;
            }
            System.out.println(aClass + "班级的平均分为：" + total / scores.size());
        }
    }
}
