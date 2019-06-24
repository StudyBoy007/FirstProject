package com.SJMS;

/**
 * Create by czq
 * time on 2019/6/4  10:07
 */
public class Test {
    public static void main(String[] args) {
        Singleton singleton=Singleton.getInstance();
        Singleton instance = Singleton.getInstance();
        System.out.println(singleton==instance);
    }
}
