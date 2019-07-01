package com.ecjtu.reflect.rflt;

/**
 * Create by czq
 * time on 2019/6/27  22:13
 */
public class AliPay implements Pay {


   public void pay(){
        System.out.println("ali pay");
    }

    @Override
    public void undo() {
        System.out.println("undo");
    }
}
