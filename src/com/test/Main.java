package com.test;

/**
 * Create by czq
 * time on 2019/6/15  20:23
 */
public class Main {
    public static void main(String[] args) {
        new Impl().test1();
        In.test();
    }
}


class Impl implements In{

}


interface In{

    default void test1(){
        System.out.println("default");
    }

     static void test(){
        System.out.println("Hello World");
    }
}
