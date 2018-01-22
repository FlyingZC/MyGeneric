package com.zc.generic.z03extends;

public class Minus2<T> implements Comparable<T>
{
    @Override
    public int compareTo(T o)
    {
        //还是只能调用Object类中的方法，编译器.alt+/查看可调用的方法
        o.equals("11");
        return 0;
    }

}
