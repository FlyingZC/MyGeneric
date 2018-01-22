package com.zc.generic.think;
//测试元组
public class TupleTest
{
    static TwoTuple<String,Integer> method1()
    {
        return new TwoTuple<String,Integer>("12",12);
    }
    static TwoTuple<String,String> method2()
    {
        return new TwoTuple<String,String>("1","a");
    }
    static ThreeTuple<String, Integer, Object> method3()
    {
        return new ThreeTuple<String, Integer, Object>("a", 1, new Object());
    }
}
