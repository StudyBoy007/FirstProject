package com.ecjtu.AbstractClassAndInterface.Door;

/**
 * Create by czq
 * time on 2019/6/4  13:50
 */
public abstract class Door {
    private double price;
    private String brand;

    public Door(double price, String brand) {
        this.price = price;
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public abstract void openDoor();
    public abstract void closeDoor();


}
