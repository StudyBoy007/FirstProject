package com.ecjtu.Duotai.Work1and2;

/**
 * Create by czq
 * time on 2019/6/3  14:59
 */
public class Master {
    public void feed(Pet[] pets) {
        for (int i=0;i<pets.length;i++){
            pets[i].eat();
        }
    }
    public void playGame(Pet pet){
        pet.play();
    }

}

