package com.ecjtu.Duotai.Work1and2;

/**
 * Create by czq
 * time on 2019/6/3  16:48
 */
public class Penguin extends Pet{

    public Penguin(int healthNumber, int deatNumber) {
        super(healthNumber, deatNumber);
    }

    @Override
    public void eat() {
        setDeatNumber(getDeatNumber()+5);
        setHealthNumber(getHealthNumber()+7);
        System.out.println("企鹅吃鱼虾，与主人亲密度增加了:"+5+"----->目前亲密度为:"+getDeatNumber());
        System.out.println("企鹅吃鱼虾，企鹅的健康值增加了:"+7+"----->目前健康值为:"+getHealthNumber());
    }

    @Override
    public void play() {
        setDeatNumber(getDeatNumber()+5);
        setHealthNumber(getHealthNumber()-10);
        System.out.println("玩游泳游戏，与主人亲密度增加了:"+5+"----->目前亲密度为:"+getDeatNumber());
        System.out.println("玩游泳游戏，企鹅健康值减少了了:"+10+"----->目前健康值为:"+getHealthNumber());
    }
}
