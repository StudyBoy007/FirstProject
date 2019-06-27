package com.ecjtu.reflect.work.work2;

import java.util.ArrayList;
import java.util.List;

/**
 * Create by czq
 * time on 2019/6/27  16:30
 */
public class Userimp implements User {
    List<User> users = new ArrayList<>();

    @Override
    public int add(User user) {
        users.add(user);
        return users.indexOf(user);
    }

    @Override
    public int delete(int id) {
        users.remove(id);
        return users.size();
    }
}
