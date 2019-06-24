package com.ecjtu.Duotai.Work3;

/**
 * Create by czq
 * time on 2019/6/3  15:26
 */
public class BieKe extends MotoVehicle{
private final double PRICE=500;
    public BieKe(String carName, String carNumber) {
        super(carName, carNumber);
    }
    @Override
    public double calRent(int day) {
        return day*PRICE;
    }
}
