package com.ecjtu.AbstractClassAndInterface.Test;

import com.ecjtu.Test.Test;

/**
 * Create by czq
 * time on 2019/6/4  8:49
 */
public class TestEquals {
    public static void main(String[] args) {
        TestEquals test = new TestEquals();
        TestEquals test1 = new TestEquals();
        System.out.println(test.equals(test1));
        System.out.println(test.getClass().getName());
    }
}
