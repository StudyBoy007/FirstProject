package com.ecjtu.Duotai.Work1and2;

/**
 * Create by czq
 * time on 2019/6/3  16:45
 */
public class Dog extends Pet{

    public Dog(int healthNumber, int deatNumber) {
        super(healthNumber, deatNumber);
    }

    @Override
    public void eat() {
        setDeatNumber(getDeatNumber()+6);
        setHealthNumber(getHealthNumber()+6);
        System.out.println("小狗吃骨头，与主人亲密度增加了:"+6+"----->目前亲密度为:"+getDeatNumber());
        System.out.println("小狗吃骨头，小狗的健康值增加了:"+6+"----->目前健康值为:"+getHealthNumber());
    }

    @Override
    public void play() {
        setDeatNumber(getDeatNumber()+5);
        setHealthNumber(getHealthNumber()-10);
        System.out.println("玩飞盘，与主人亲密度增加了:"+5+"----->目前亲密度为:"+getDeatNumber());
        System.out.println("玩飞盘，企鹅健康值减少了了:"+10+"----->目前健康值为:"+getHealthNumber());
    }
}
