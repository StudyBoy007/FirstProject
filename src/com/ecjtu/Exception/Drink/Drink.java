package com.ecjtu.Exception.Drink;

/**
 * Create by czq
 * time on 2019/6/5  11:16
 */
public abstract class Drink {
    private String drinkType;

    public Drink(String drinkType) {
        this.drinkType = drinkType;
    }

    public Drink() {
    }

    public abstract void taste();

    public String getDrinkType() {
        return drinkType;
    }

    public void setDrinkType(String drinkType) {
        this.drinkType = drinkType;
    }

    public static String getDrink(int drinkType) throws DrinkNotFoundException {
        switch (drinkType){
            case 1:return "Milk";
            case 2:return "Coffee";
            case 3:return "Beer";
            default:throw new DrinkNotFoundException("本店不提供这种下午茶哦！请根据菜单重新选择~");
        }
    }
}
