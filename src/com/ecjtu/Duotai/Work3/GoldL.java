package com.ecjtu.Duotai.Work3;

/**
 * Create by czq
 * time on 2019/6/3  15:26
 */
public class GoldL extends MotoVehicle {
    private int sitPeopleNumber;
    private final double PRICE=800;

    public GoldL(String carName, String carNumber, int sitPeopleNumber) {
        super(carName, carNumber);
        this.sitPeopleNumber = sitPeopleNumber;
    }
    @Override
    public double calRent(int day) {
        return day*PRICE;
    }
}
