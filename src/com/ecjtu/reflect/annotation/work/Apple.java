package com.ecjtu.reflect.annotation.work;

/**
 * Create by czq
 * time on 2019/6/28  10:04
 */
public class Apple {
    @FruitName(name = "小绿绿")
    private String name;
    @FruitColor
    private String color;
    @FruitProvider
    private String provider;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }
}
