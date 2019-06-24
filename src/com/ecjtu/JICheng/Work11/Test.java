package com.ecjtu.JICheng.Work11;

/**
 * Create by czq
 * time on 2019/6/3  19:37
 */
public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal(2, 4);
        System.out.println("动物的眼睛有："+animal.getEyes()+"只");
        System.out.println("动物的腿有："+animal.getLegs()+"条");
        animal.eat();
        animal.run();

        Bird bird = new Bird(2, 4, 2);
        System.out.println("鸟的眼睛有："+bird.getEyes()+"只");
        System.out.println("鸟的腿有："+bird.getLegs()+"条");
        System.out.println("鸟的翅膀有："+bird.getWings()+"只");
        bird.eat();
        bird.fly();

    }
}
