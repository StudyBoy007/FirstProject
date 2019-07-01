package com.ecjtu.reflect.annotation.work;

import org.junit.Test;

import java.lang.reflect.Field;

/**
 * Create by czq
 * time on 2019/6/28  10:06
 */
public class TestApple {

    @Test
    public void testField() {
        Class<Apple> appleClass = Apple.class;
        Field[] fields = appleClass.getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(FruitName.class)) {
                FruitName fruitName = field.getAnnotation(FruitName.class);
                System.out.println("苹果的名字为：" + fruitName.name());
            }
            if (field.isAnnotationPresent(FruitColor.class)) {
                FruitColor fruitColor = field.getAnnotation(FruitColor.class);
                System.out.println("苹果的颜色为：" + fruitColor.color());
            }
            if (field.isAnnotationPresent(FruitProvider.class)) {
                FruitProvider annotation = field.getAnnotation(FruitProvider.class);
                System.out.println("苹果的供应商为：" + annotation.provider());
            }
        }
    }
}
