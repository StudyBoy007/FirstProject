package com.ecjtu.Collection.Work2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Create by czq
 * time on 2019/6/21  11:20
 */
public class Work2 {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("李飞", 18));
        users.add(new User("刘梦昊", 50));
        users.add(new User("蔡泽球", 16));
        users.add(new User("叶挺", 50));

        users.sort(new ageCompare());
        for (User user : users) {
            System.out.println(user);
        }
    }
}
