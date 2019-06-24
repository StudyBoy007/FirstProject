package com.ecjtu.Collection;

import com.ecjtu.Collection.Work2.User;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/**
 * Create by czq
 * time on 2019/6/21  14:01
 */
public class Work3 {
    public static void main(String[] args) {
        HashSet<User> users = new HashSet<>();
        users.add(new User("李飞", 18));
        users.add(new User("蔡泽球", 16));
        users.add(new User("蔡泽球", 16));
        forEach(users);
        System.out.println("------------------------------");
        IteratorforEach(users);
    }

    /**
     * foreach遍历
     */
    public static void forEach(HashSet set) {
        for (Object obj : set) {
            System.out.println(obj.toString());
        }
    }


    /**
     * 迭代器遍历
     */
    public static void IteratorforEach(HashSet<?> set) {
        Iterator<?> iterator = set.iterator();
        while (iterator.hasNext()){
            Object obj=iterator.next();
            System.out.println(obj.toString());
        }
    }
}
