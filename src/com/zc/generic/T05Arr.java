package com.zc.generic;

import java.util.Arrays;

public class T05Arr<T>
{
    //可变个数形参.泛型数组.可变个数形参，返回值只能是数组
    public T[] getArr(T... args)
    {
        return args;
    }

    public static void main(String[] args)
    {
        T05Arr<String> s = new T05Arr<String>();
        String[] arr = s.getArr("a", "b", "c");
        System.out.println(Arrays.toString(arr));
    }
}
