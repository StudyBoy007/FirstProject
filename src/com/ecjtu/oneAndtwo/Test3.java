package com.ecjtu.oneAndtwo;

import java.util.concurrent.CountDownLatch;

/**
 * Create by czq
 * time on 2019/5/29  16:15
 */
public class Test3 {
    public static void main(String[] args) {
        int enter=0;
        for (int i=1;i<=100;i++){
            if(i%7==0){
                System.out.print(i+" ");
                continue;
            }
            if(i%10==7){
                System.out.print(i+" ");
                continue;
            }
        }
    }

}
