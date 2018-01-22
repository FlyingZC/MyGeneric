package com.zc.generic.z03extends;

public class Minus4
{
    //<T extends Comparable>:T类型的变量可使用Comparable中的方法
    public static <T extends Comparable> T max(T... a)
    {
        T maxElem = a[0];
        for (T item : a)
        {
            if (item.compareTo(maxElem) > 0)
            {
                maxElem = item;
            }
        }
        return maxElem;
    }

    public static <T extends Comparable> T min(T... a)
    {
        T smallest = a[0];
        for (T item : a)
        {
            //item和smallest比，item-smallest
            if (item.compareTo(smallest) < 0)
            {
                smallest = item;
            }
        }
        return smallest;
    }

    public static void main(String[] args)
    {
        //T...a
        int max = Minus4.max(Integer.valueOf(1), 3, 5, 7);
        System.out.println(max);
        int min = Minus4.min(Integer.valueOf(1), 3, 5, 7);
        System.out.println(min);
    }

}
