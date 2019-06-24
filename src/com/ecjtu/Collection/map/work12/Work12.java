package com.ecjtu.Collection.map.work12;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Create by czq
 * time on 2019/6/24  17:41
 */
public class Work12 {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("Tom", "CoreJava");
        hashMap.put("John", "Oracle");
        hashMap.put("Susan", "Oracle");
        hashMap.put("Jerry", "JDBC");
        hashMap.put("Jim", "Unix");
        hashMap.put("Kevin", "JSP");
        hashMap.put("Lucy", "JSP");
        //增加一位新老师
        hashMap.put("Allen", "JDBC");
        //Lucy 改为教CoreJava
        hashMap.put("Lucy", "CoreJava");
        Set<Map.Entry<String, String>> entries = hashMap.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + "老师教的课程为：" + entry.getValue());
        }
        System.out.println("-------------------------");
        System.out.println("教JSP的老师有如下：");
        for (Map.Entry<String, String> entry : entries) {
            if (entry.getValue() == "JSP") {
                System.out.println(entry.getKey());
            }
        }
    }
}
