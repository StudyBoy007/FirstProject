package com.ecjtu.reflect.test;

/**
 * Create by czq
 * time on 2019/6/27  9:27
 */
public class Test1 {
    private static int age = 0;

    static {
        System.out.println("阿昊你是煞笔");
    }

    public static void main(String[] args) {
        Class<Test1> test1Class = Test1.class;
        System.out.println("阿昊我是傻逼");
        Test2 test2 = new Test2();
        test2.test();
    }
}
