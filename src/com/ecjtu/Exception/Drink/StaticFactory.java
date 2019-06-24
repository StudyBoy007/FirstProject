package com.ecjtu.Exception.Drink;

import java.util.Scanner;

/**
 * Create by czq
 * time on 2019/6/5  14:21
 */
public class StaticFactory {
    public static void main(String[] args) {
        System.out.println("欢迎来到皮皮下午茶,请根据菜单选择你想要的下午茶：");
        String drinkType=null;
        while (true) {
            System.out.println("1.Milk\n2.Coffee\n3.Beer");
            Scanner input = new Scanner(System.in);
            int i = input.nextInt();
            try {
                drinkType=Drink.getDrink(i);
                break;
            } catch (DrinkNotFoundException e) {
                System.out.println(e.getMessage());
                continue;
            }
        }
        Drink drink=DrinkFactory.Drink(drinkType);
            drink.taste();
    }
}
