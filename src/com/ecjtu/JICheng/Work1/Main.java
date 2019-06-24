package com.ecjtu.JICheng.Work1;

/**
 * Create by czq
 * time on 2019/6/3  14:44
 */
public class Main {
    public static void main(String[] args) {
        WuMingFen wuMingFen = new WuMingFen();
        wuMingFen.setTheMa("酸辣粉");
        wuMingFen.setQuantity(2);
        wuMingFen.setLikeSoup(true);
        wuMingFen.check();
        WuMingFen niulou = new WuMingFen("牛肉", 2);
        niulou.check();
    }
}
