package com.ecjtu.AbstractClassAndInterface.Door;

/**
 * Create by czq
 * time on 2019/6/4  13:59
 */
public class DoorTest {
    public static void main(String[] args) {
        DoorFt doorFt = new DoorFt(1000,"天堂");
        DoorWater doorWater = new DoorWater(2000,"罗技");
        DoorBullet doorBullet = new DoorBullet(3000,"米达琳");
        System.out.println("防盗门价格为："+doorFt.getPrice()+",品牌为："+doorFt.getBrand());
        doorFt.openDoor();
        doorFt.closeDoor();
        doorFt.ftPROOF();
        System.out.println("----------------------------------");
        System.out.println("防水门价格为："+doorWater.getPrice()+",品牌为："+doorWater.getBrand());
        doorWater.openDoor();
        doorWater.closeDoor();
        doorWater.waterproof();
        System.out.println("----------------------------------");
        System.out.println("防弹门价格为："+doorBullet.getPrice()+",品牌为："+doorBullet.getBrand());
        doorBullet.openDoor();
        doorBullet.closeDoor();
        doorBullet.bulletproof();
    }
}
