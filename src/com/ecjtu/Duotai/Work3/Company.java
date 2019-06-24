package com.ecjtu.Duotai.Work3;

import sun.java2d.pipe.SpanIterator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Create by czq
 * time on 2019/6/3  15:27
 */
public class Company {
    public static void main(String[] args) {
        Company company = new Company();
//        List<MotoVehicle> cars=new ArrayList<>();
//        cars.add(new truck("大货车", "京NB6666", 50));
//        cars.add(new BaoMa("宝马550i", "京NY9999999"));
//        cars.add(new BaoMa("宝马550i", "京NY6666666"));
//        cars.add(new BieKe("林荫大道别克", "京123456"));
//        cars.add(new GoldL("金龙", "京NB23444", 34));
//        System.out.println("序号\t\t\t车名\t\t\t车牌号");
//        for (MotoVehicle car:cars){
//            System.out.println((cars.indexOf(car)+1)+"\t\t\t"+car.getCarName()+"\t\t\t"+car.getCarNumber());
//        }
//        System.out.println("请输入你要租车的数量：");
        MotoVehicle[] motoVehicle = {new truck("大货车", "京NB6666", 50),new BaoMa("宝马550i", "京NY9999999"), new BaoMa("宝马550i", "京NY6666666"),
                new BieKe("林荫大道别克", "京123456"), new GoldL("金龙", "京NB23444", 34)};
        double money = company.calTotalRent(motoVehicle, 5);
        System.out.println("总共花费了：" + money);
    }

    public double calTotalRent(MotoVehicle[] motoVehicles, int days) {
        double totalMoney = 0;
        for (int i = 0; i < motoVehicles.length; i++) {
            totalMoney += motoVehicles[i].calRent(days);
        }
        return totalMoney;
    }
}

