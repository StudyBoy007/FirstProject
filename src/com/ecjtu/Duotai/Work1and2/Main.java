package com.ecjtu.Duotai.Work1and2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Create by czq
 * time on 2019/6/3  14:58
 */
public class Main {
    public static void main(String[] args) {
        Master master = new Master();
        Pet[] pets = {new Dog(10, 10),new Cat(7, 7),new Penguin(12,12)};
        master.feed(pets);
        System.out.println("------------------------");
        System.out.println("请领养下列一只宠物：");
        System.out.println("1.小狗\n2.小猫\n3.企鹅");
        Pet choosePet=null;
        Scanner scanner = new Scanner(System.in);
        out:
        while (true) {
            try {
                int index=scanner.nextInt();
                switch (index){
                    case 1:choosePet=pets[0];break out;
                    case 2:choosePet=pets[1];break out;
                    case 3:choosePet=pets[2];break out;
                    default:
                        System.out.println("输入有误，请重新输入");
                }
            } catch (InputMismatchException e) {
                System.out.println("请输入整形数值！！");
                String str=scanner.next();
            }
        }
        master.playGame(choosePet);
    }
}
