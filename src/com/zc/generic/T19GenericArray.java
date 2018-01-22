package com.zc.generic;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.junit.Test;

/**
 * @author Flyingzc
 * 生成 泛型数组
 */
public class T19GenericArray
{
    @Test
    public void test()
    {
        Integer[] arr01 = new GenericArrayType<Integer>(10).getArray();
        
        Integer[] arr02 = GenArray.<Integer>genArray(10);
    }
    
    /**
     * 移除 特定类型数组中的 某个重复元素
     * @param originalArray
     * @param removeElement 该元素可以为null
     * @return
     */
    private static <T> T[] removeDuplicateElement(T[] originalArray, Class<T> clazz, T removeElement)
    {
        T[] afterArray = (T[]) Array.newInstance(clazz, originalArray.length);
        //T[] afterArray = (T[]) new Object[originalArray.length];
        int afterArrayCurrIndex = 0;
        for (T each : originalArray)
        {
            //若传入的元素为 null 且 当前元素为null,跳过
            if (removeElement == null)
            {
                if (each == null)
                {
                    continue;
                }
            }
            else
            {//若传入的元素不为null,且 和当前数组元素相等,跳过
                if (each.equals(removeElement))
                {
                    continue;
                }
            }
            //其他情况,复制数组
            afterArray[afterArrayCurrIndex++] = each;
        }
        return Arrays.copyOf(afterArray, afterArrayCurrIndex);
    }
}

class GenericArrayType<T>
{
    private T[] array;
    public GenericArrayType(int size)
    {
        array = (T[])new Object[size];
    }

    public T[] getArray()
    {
        return array;
    }

    public void setArray(T[] array)
    {
        this.array = array;
    }
    
}

class GenArray
{
    public static <E> E[] genArray(int size)
    {
        return (E[])new Object[size];
    }
}
