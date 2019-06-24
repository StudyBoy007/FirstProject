package com.ecjtu.Duotai.Work3;

/**
 * Create by czq
 * time on 2019/6/3  15:22
 */
public class MotoVehicle {
    private String carName;
    private String carNumber;

    public MotoVehicle(String carName, String carNumber) {
        this.carName = carName;
        this.carNumber = carNumber;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }
    public double calRent(int day){
        return 0;
    }
}
