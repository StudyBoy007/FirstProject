package com.ecjtu.Exception.Drink;


/**
 * Create by czq
 * time on 2019/6/5  11:32
 */
public class DrinkFactory {
    public static Drink Drink(String type) {
        Drink drink = null;
        try {
            drink = (Drink) Class.forName("com.ecjtu.Exception.Drink."+type).newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return drink;
    }
}
