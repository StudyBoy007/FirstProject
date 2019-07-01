package com.ecjtu.reflect.rflt;

/**
 * Create by czq
 * time on 2019/6/27  22:23
 */
public class PayProxy implements Pay {

    private Pay pay;

    public PayProxy(Pay pay) {
        this.pay = pay;
    }

    @Override
    public void pay() {
        System.out.println("do before");
        pay.pay();
        System.out.println("do after");
    }

    @Override
    public void undo() {
        System.out.println("do before");
        pay.undo();
        System.out.println("do after");
    }


}
