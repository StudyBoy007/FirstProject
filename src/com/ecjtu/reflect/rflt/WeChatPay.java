package com.ecjtu.reflect.rflt;

/**
 * Create by czq
 * time on 2019/6/27  22:14
 */
public class WeChatPay implements Pay {


   public void pay(){
        System.out.println("wechat pay");
    }

    @Override
    public void undo() {
        System.out.println("undo");
    }
}
