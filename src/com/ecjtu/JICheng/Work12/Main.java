package com.ecjtu.JICheng.Work12;

/**
 * Create by czq
 * time on 2019/6/3  11:30
 */
public class Main {
    public static void main(String[] args) {
        College college = new College("刘梦昊", 20, "华东交通大学");
        Undergraduate undergraduate = new Undergraduate("蔡泽球", 21, "软件工程");
        Graduate graduate = new Graduate("李飞", 22, "软件开发");
        college.display();
        System.out.println();
        undergraduate.display();
        System.out.println(
        );
        graduate.display();
    }
}
