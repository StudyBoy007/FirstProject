package com.ecjtu.reflect.work;

/**
 * Create by czq
 * time on 2019/6/27  21:49
 */
public interface Test {


    default void run(){
        System.out.println("Hello WOrld");
    }
}
