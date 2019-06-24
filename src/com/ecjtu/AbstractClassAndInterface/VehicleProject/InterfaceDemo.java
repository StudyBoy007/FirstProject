package com.ecjtu.AbstractClassAndInterface.VehicleProject;

/**
 * Create by czq
 * time on 2019/6/4  11:22
 */
public class InterfaceDemo {
    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.start();
        bike.stop();
        Bus bus = new Bus();
        bus.start();
        bus.stop();
    }
}
