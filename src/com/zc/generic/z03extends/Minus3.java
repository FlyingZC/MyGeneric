package com.zc.generic.z03extends;

public class Minus3<T extends Comparable> implements Comparable<T>
{

    @Override
    public int compareTo(T t)
    {
        //compareTo接口中的方法
        t.compareTo(1);
        return 0;
    }

}
