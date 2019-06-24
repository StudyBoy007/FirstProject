package com.ecjtu.AbstractClassAndInterface.Door;

/**
 * Create by czq
 * time on 2019/6/4  13:58
 */
public class DoorWater extends Door implements waterproof {


    public DoorWater(double price, String brand) {
        super(price, brand);
    }

    @Override
    public void openDoor() {
        System.out.println("门被打开");
    }

    @Override
    public void closeDoor() {
        System.out.println("门被关上");
    }

    @Override
    public void waterproof() {
        System.out.println("我具有防水的功能");
    }
}
