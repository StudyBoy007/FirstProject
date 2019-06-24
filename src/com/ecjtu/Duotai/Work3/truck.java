package com.ecjtu.Duotai.Work3;

/**
 * Create by czq
 * time on 2019/6/3  16:20
 */
public class truck extends MotoVehicle {
    private int weight;
    private final double PRICE=50;

    public truck(String carName, String carNumber, int weight) {
        super(carName, carNumber);
        this.weight = weight;
    }
    @Override
    public double calRent(int day) {
        return day*PRICE*weight;
    }
}
