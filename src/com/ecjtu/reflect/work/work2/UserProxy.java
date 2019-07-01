package com.ecjtu.reflect.work.work2;

/**
 * Create by czq
 * time on 2019/6/27  22:02
 */
public class UserProxy implements User {
    private Userimp userimp;


    public UserProxy(Userimp userimp) {
        this.userimp = userimp;
    }

    @Override
    public int add(User user) {
        System.out.println("cvrvertbvetr");
        int add = userimp.add(user);
        System.out.println("verbiuveri");
        return add;
    }

    @Override
    public int delete(int id) {
        return 0;
    }
}
