package com.ecjtu.reflect.factory;

import com.ecjtu.reflect.Impl.IgetName;

import java.io.IOException;
import java.util.Properties;

/**
 * Create by czq
 * time on 2019/6/27  10:03
 */
public class Factory {
    private static Factory instance = new Factory();
    static Properties pro = new Properties();

    static {
        try {
            pro.load(Factory.class.getClassLoader().getResourceAsStream("config.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private Factory() {

    }

    public static Factory getInstance() {
        return instance;
    }

    //生成接口的对象
    public static IgetName getName() {
        IgetName instance = null;
        //获取配置文件的信息
        String value = pro.getProperty("cls");
        try {
            Class cls = Class.forName(value);
            instance = (IgetName) cls.newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return instance;
    }
}
