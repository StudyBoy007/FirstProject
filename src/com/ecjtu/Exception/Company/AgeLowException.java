package com.ecjtu.Exception.Company;

/**
 * Create by czq
 * time on 2019/6/5  16:04
 */
public class AgeLowException extends Exception{
    public AgeLowException(String message) {
        super(message);
    }

//    public static void main(String[] args) {
    //自定义异常的构造方法传给父类构造函数的message,可以用继承父类的getmessage()方法得到，其实就是相对于message,是父类的一个私有的属性，
    //需要通过父类继承给子类的get方法获取该属性的值
//        System.out.println(new AgeLowException("1").getMessage());

//    }
}
