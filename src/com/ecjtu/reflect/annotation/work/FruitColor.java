package com.ecjtu.reflect.annotation.work;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Create by czq
 * time on 2019/6/28  9:57
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface FruitColor {
    String color() default "红色";
}
