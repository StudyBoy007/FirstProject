package com.ecjtu.Collection.Work4;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.*;

/**
 * Create by czq
 * time on 2019/6/21  14:22
 */
public class Work4 {
    public static void main(String[] args) {
        HashMap<Integer, Student> map = new HashMap<>();
        Student student1 = new Student(1, "蔡泽球");
        Student student2 = new Student(2, "李飞");
        Student student3 = new Student(3, "刘梦昊");
        map.put(student1.id, student1);
        map.put(student3.id, student3);
        map.put(student2.id, student2);
        ArrayList<Map.Entry<Integer, Student>> list = new ArrayList<>(map.entrySet());
        list.sort(new idCompare());
        for (Map.Entry<Integer, Student> entry : list) {
            System.out.println(entry.getValue().id + ":" + entry.getValue().name);
        }
        System.out.println("----------------");
        //迭代器
        Iterator<Map.Entry<Integer, Student>> iterator = list.iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Student> obj = iterator.next();
            System.out.println(obj.getKey()+":"+obj.getValue().name);
        }
    }

}
