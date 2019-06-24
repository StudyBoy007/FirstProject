package com.ecjtu.AbstractClassAndInterface.VehicleProject;

/**
 * Create by czq
 * time on 2019/6/4  11:19
 */
public class Bus extends Vehicle {
    @Override
    public void start() {
        System.out.println("Bus起步了");
    }

    @Override
    public void stop() {
        System.out.println("Bus停了下来");
    }
}
