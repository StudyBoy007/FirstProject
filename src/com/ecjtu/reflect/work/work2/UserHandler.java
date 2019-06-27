package com.ecjtu.reflect.work.work2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Create by czq
 * time on 2019/6/27  16:28
 */
public class UserHandler implements InvocationHandler {
    Object object;

    public UserHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("我被授予了权限，我可以代理运行了");
        Object result = method.invoke(object, args);
        System.out.println("代理操作完成了，写入了日志文件");
        return result;
    }
}
