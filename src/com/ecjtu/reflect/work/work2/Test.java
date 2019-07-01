package com.ecjtu.reflect.work.work2;

import net.sf.cglib.proxy.InvocationHandler;
import net.sf.cglib.proxy.Proxy;

/**
 * Create by czq
 * time on 2019/6/27  16:41
 */
public class Test {
    public static void main(String[] args) {




        Userimp userimp = new Userimp();
        UserProxy userProxy=new UserProxy(userimp);

//        UserHandler handler = new UserHandler(userimp);
//        User userimpProxy = (User) Proxy.newProxyInstance(userimp.getClass().getClassLoader(), userimp.getClass().getInterfaces(),  handler);
//        System.out.println("加入的元素在该对象集合中的索引为："+userimpProxy.add(userimp));
//

//            aop
        test(userimp);

    }


    public static void test(User user){
        System.out.println("user"+"dvfvgdgtdbhtr");
        user.add(null);
        System.out.println("user"+"complete");
    }
}
