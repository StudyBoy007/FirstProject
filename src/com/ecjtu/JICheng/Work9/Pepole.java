package com.ecjtu.JICheng.Work9;

/**
 * Create by czq
 * time on 2019/6/3  10:04
 */
public class Pepole extends Monkey{
    Pepole(String s) {
        super(s);
    }

    @Override
    public void speak() {
        System.out.println(super.getName()+"：小样的，不错嘛，会说话了！");
    }

    public void think(){
        System.out.println("别说话，认真思考");
    }

    @Override
    public String getName() {
        return super.getName();//放回的是父类的中的name属性的值
    }
}
