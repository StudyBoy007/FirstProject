package com.ecjtu.JICheng.Work2;

/**
 * Create by czq
 * time on 2019/6/3  17:23
 */
public class Trunk extends Vehicle{
    private float load;

    public Trunk(String brand, String color, float load) {
        super(brand, color);
        this.load = load;
    }

    @Override
    public void showinfo() {
        System.out.println("牌子："+getBrand()+"\n"+"颜色："+getColor()+"\n"+"载重："+this.load+"吨");
    }
}
