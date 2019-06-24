package com.ecjtu.objectC.Test4;

/**
 * Create by czq
 * time on 2019/5/31  12:46
 */
public class Animal {
    public String species;

    Animal() {
        System.out.println("我是父类的无参构造函数");
    }

    public Animal(String species) {
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
}

class dog extends Animal {


    public dog(String species) {
        super(species);
    }
//this（）super（）为什么放第一行，是因为必须先初始化父类，子类的属性才能被初始化，再能被调用
    public dog() {
            super();
        System.out.println("我是子类的无参构造函数");
    }
}
