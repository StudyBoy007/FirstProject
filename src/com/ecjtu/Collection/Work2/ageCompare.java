package com.ecjtu.Collection.Work2;


import java.util.Comparator;

/**
 * Create by czq
 * time on 2019/6/21  11:22
 */
public class ageCompare implements Comparator<User> {


    @Override
    public int compare(User o1, User o2) {
        if (o1.age > o2.age) {
            return 1;
        }
        if (o1.age < o2.age) {
            return -1;
        }
        return 0;
    }
}
