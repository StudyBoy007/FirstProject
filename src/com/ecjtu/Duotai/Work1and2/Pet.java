package com.ecjtu.Duotai.Work1and2;

/**
 * Create by czq
 * time on 2019/6/3  14:51
 */
public class Pet {
    private int healthNumber;
    private int deatNumber;

    public Pet(int healthNumber, int deatNumber) {
        this.healthNumber = healthNumber;
        this.deatNumber = deatNumber;
    }

    public int getDeatNumber() {
        return deatNumber;
    }

    public void setDeatNumber(int deatNumber) {
        this.deatNumber = deatNumber;
    }

    public int getHealthNumber() {
        return healthNumber;
    }

    public void setHealthNumber(int healthNumber) {
        this.healthNumber = healthNumber;
    }

    public void eat(){
        System.out.println("我可以吃东西");
    }
    public void play(){
        System.out.println("我喜欢玩耍");
    }
}
