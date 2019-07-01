package com.ecjtu.reflect.annotation.annonation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 注解使用无参的方法来代表属性，有数据类型，对应无参方法的返回值
 * * 方法名就是属性名
 * * 可以有默认值，后边跟着default 默认值，
 * * 还可以有多个值
 * * @Retention(RetentionPolicy.RUNTIME)
 * * 虚拟机对注解保存到什么阶段，保存运行阶段，
 * * 在运行期通过反射获取注解信息
 * * @Target():自定义注解需要运用到类、方法、字段、构造方法，局部变量
 */
@Target({ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.METHOD, ElementType.LOCAL_VARIABLE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Param {
    String name() default "张三";

    int age() default 20;

    String[] address() default "宝南路83号";

    String sex() default "男";

    String hobby() default "篮球";
}
