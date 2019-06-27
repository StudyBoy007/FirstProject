package com.ecjtu.reflect.test1;

import com.ecjtu.reflect.Impl.IgetName;
import com.ecjtu.reflect.factory.Factory;
import org.junit.Test;

/**
 * Create by czq
 * time on 2019/6/27  10:11
 */
public class TestFactory {
    @Test
    public void getinstance() {
        Factory factory = Factory.getInstance();
        IgetName igetName = factory.getName();
    }
}
