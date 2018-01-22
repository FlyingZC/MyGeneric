package com.zc.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * 泛型 与 可变参数
 * @author flyingzc
 *
 */
public class T13GenArgs
{
    public static <T> List<T> makeList(T... args)
    {
        ArrayList<T> list =  new ArrayList<T>();
        for(T item : args)
        {
            list.add(item);
        }
        return list;
    }
}
