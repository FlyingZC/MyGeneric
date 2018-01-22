package com.zc.generic.z03extends;

public class Print<T>
{
    T t;

    void show()
    {
        //t对象能调的所有方法均只能是Object类中的方法
        t.equals("1");
    }
}
