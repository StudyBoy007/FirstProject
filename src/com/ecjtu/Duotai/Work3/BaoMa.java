package com.ecjtu.Duotai.Work3;

/**
 * Create by czq
 * time on 2019/6/3  15:24
 */
public class BaoMa extends MotoVehicle {
    private final double PRICE=1000;
    public BaoMa(String carName, String carNumber) {
        super(carName, carNumber);
    }

    @Override
    public double calRent(int day) {
        return day*PRICE;
    }
}
