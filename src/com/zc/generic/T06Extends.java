package com.zc.generic;

import java.awt.Color;
import java.io.Serializable;

public class T06Extends<T extends Comparable<T> & Serializable>
{
    public T06Extends(T first)
    {

    }
}

//extends多个,类在前,接口在后
class Base
{
    public void baseMethod()
    {

    }
}

//声明两个泛型类型E,T,其中T继承自...且Comparable本身就接收泛型E
class Gen<E, T extends Base & Comparable<E> & Serializable>
{

}

//=======================
class BaseGeneric<T>
{

}

interface MyType
{
    Color getColor();
}

class MyGenericType<F>
{
    F item;

    public F getItem()
    {
        return item;
    }

    public void setItem(F item)
    {
        this.item = item;
    }

}

//继承 的 同时 再添加上届,此时可以用t掉出MyType中的方法.
class SubGeneric<T extends MyType> extends BaseGeneric<T>
{
    T t;

    public void testMethod()
    {
        t.getColor();
    }
}

class SubGeneric2<T extends MyGenericType<T>> extends BaseGeneric<T>
{
    T t;

    public void testMethod()
    {
        t.getItem();
    }
}

class SubGeneric3<F, T extends MyGenericType<F>> extends BaseGeneric<T>
{
    T t;

    //这个F被擦除成Object,因为它没上届
    F f;

    public void testMethod()
    {
        t.getItem();
    }
}

class SubGeneric4<F, T extends MyGenericType<F>> extends BaseGeneric<T>
{
    T t;

    //这个F被擦除成Object,因为它没上届
    F f;

    public void testMethod()
    {
        t.getItem();
    }
}
