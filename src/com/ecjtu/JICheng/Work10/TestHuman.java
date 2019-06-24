package com.ecjtu.JICheng.Work10;

/**
 * Create by czq
 * time on 2019/6/3  16:13
 */
public class TestHuman {
    public static void main(String[] args) {
        Human woman = new Woman("Marry", 16);
        Human man=new Man("jerry", 20);
        woman.play();
        man.play();
    }
}
