package com.ecjtu.JICheng.Work9;

/**
 * Create by czq
 * time on 2019/6/3  10:04
 */
public class Monkey {
     private String name;
   public Monkey(String s){
        this.name=s;
    }
    Monkey(){}

    public String getName() {
        return name;
    }

    public void speak(){
        System.out.println(this.name+"：咿咿呀呀....");
    }
}
