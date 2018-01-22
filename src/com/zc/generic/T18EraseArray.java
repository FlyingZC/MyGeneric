package com.zc.generic;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.junit.Test;

//数组 擦除的处理
public class T18EraseArray
{
    @Test
    public void test01()
    {
        GenericArray<Integer> arr = new GenericArray<Integer>(Integer.class, 10);
        for (int i = 0; i < 6; i++)
        {
            arr.add(i);
        }
        System.out.println(arr.get(4));
    }

}

class GenericArray<T>
{
    private T[] elements;

    private int size;

    public GenericArray(Class<T> clazz, int length)
    {
        elements = (T[]) Array.newInstance(clazz, length);
    }

    public void add(T e)
    {
        rangeCheck();
        elements[size++] = e;
    }

    public T get(int index)
    {
        rangeCheck();
        return (T) elements[index];
    }

    private void rangeCheck()
    {
        if (size < 0 || size >= elements.length)
        {
            throw new ArrayIndexOutOfBoundsException("下标越界");
        }
    }

}
