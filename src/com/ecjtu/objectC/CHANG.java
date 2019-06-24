package com.ecjtu.objectC;

import sun.print.SunMinMaxPage;

/**
 * Create by czq
 * time on 2019/5/31  14:56
 */
public class CHANG {
    public static void main(String[] args) {
        System.out.println(add(1,2,3,4));
    }
    static int add(int... x){
        int sum=0;
        for (int y:x){
            sum+=y;
        }
        return sum;
    }
}
