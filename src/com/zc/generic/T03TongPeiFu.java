package com.zc.generic;

import org.junit.Test;

public class T03TongPeiFu
{
    @Test
    public void test01()
    {
        //使用通配符 和 extends 限定 范围
        Class<? extends Number> numClazz = int.class;
        numClazz = double.class;
        numClazz = float.class;
    }
}
