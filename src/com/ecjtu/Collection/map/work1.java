package com.ecjtu.Collection.map;

import java.util.HashMap;
import java.util.Random;

/**
 * Create by czq
 * time on 2019/6/24  11:24
 */
public class work1 {
    public static void main(String[] args) {
        HashMap<Integer, Student> hashMap = new HashMap<>();
        Student student = new Student(1, "啊一");
        Student student1 = new Student(2, "啊二");
        Student student2 = new Student(3, "啊三");
        Student student3 = new Student(4, "啊四");
        Student student4 = new Student(5, "啊五");
        hashMap.put(student.id, student);
        hashMap.put(student1.id, student);
        hashMap.put(student2.id, student);
        hashMap.put(student3.id, student);
        hashMap.put(student4.id, student);
        HashMap<Integer, Integer> hashMap2 = new HashMap<>();
        hashMap2.put(student.id, 0);
        hashMap2.put(student1.id, 0);
        hashMap2.put(student2.id, 0);
        hashMap2.put(student3.id, 0);
        hashMap2.put(student4.id, 0);
        for (int i = 0; i < 1000; i++) {
            Random random = new Random();
            int num = random.nextInt(5) + 1;
            if (hashMap2.containsKey(num)) {
                hashMap2.put(num, hashMap2.get(num) + 1);
            }
        }


    }
}
