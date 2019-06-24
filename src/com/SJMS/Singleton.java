package com.SJMS;

/**
 * Create by czq
 * time on 2019/6/4  10:04
 */
public class Singleton {
    private static Singleton singleton=new Singleton(); //饿汉式
////    private static Singleton singleton;//懒汉

    private Singleton() {
    }

    public static Singleton getInstance(){
//        if(singleton==null){
//            singleton=new Singleton(); //懒汉 因为没有对象在创建，所以懒
//        }
        return singleton;
    }

    public void test(){
        System.out.println("我是测试方法");
    }
}
