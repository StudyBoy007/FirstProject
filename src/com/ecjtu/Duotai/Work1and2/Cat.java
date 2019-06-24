package com.ecjtu.Duotai.Work1and2;

/**
 * Create by czq
 * time on 2019/6/3  14:52
 */
public class Cat extends Pet {

    public Cat(int healthNumber, int deatNumber) {
        super(healthNumber, deatNumber);
    }

    @Override
    public void eat() {
        setDeatNumber(getDeatNumber()+3);
        setHealthNumber(getHealthNumber()+4);
        System.out.println("小猫吃猫粮，与主人亲密度增加了:"+3+"----->目前亲密度为:"+getDeatNumber());
        System.out.println("小猫吃猫粮，小猫的健康值增加了:"+4+"----->目前健康值为:"+getHealthNumber());
    }
    @Override
    public void play() {
        setDeatNumber(getDeatNumber()+5);
        setHealthNumber(getHealthNumber()-10);
        System.out.println("玩球球，与主人亲密度增加了:"+5+"----->目前亲密度为:"+getDeatNumber());
        System.out.println("玩球球，企鹅健康值减少了了:"+10+"----->目前健康值为:"+getHealthNumber());
    }
}
