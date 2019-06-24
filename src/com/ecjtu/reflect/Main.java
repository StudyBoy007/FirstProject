package com.ecjtu.reflect;

import com.ecjtu.AbstractClassAndInterface.Account.Account;

import java.lang.reflect.Method;
import java.util.Objects;

/**
 * Create by czq
 * time on 2019/6/17  23:21
 */
public class Main {
    //
    public static void main(String[] args) {
        Account account = new Account("", 1);
        Account account1 = new Account("111", 1);



        System.out.println(account.getClass() == account1.getClass());


        object(account);
    }


    //字节码文件存放类的元信息
    public static void object(Object o) {
        Class<?> aClass = o.getClass();

        Method[] classMethods = aClass.getMethods();
        for (Method classMethod:classMethods){
            System.out.println(classMethod);
        }

        System.out.println("______________________________________");
        Method[] declaredMethods = aClass.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);
        }


    }
}
