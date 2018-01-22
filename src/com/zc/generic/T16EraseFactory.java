package com.zc.generic;

import org.junit.Test;

public class T16EraseFactory
{
    @Test
    public void test01()
    {
        CreateX x = new CreateX(new IntegerClassFactory());
        System.out.println(x.getT());
    }
}

interface IClassFactory<T>
{
    T create();
}

class IntegerClassFactory implements IClassFactory<Integer>
{
    @Override
    public Integer create()
    {
        return 1;
    }
}

class CreateX<T>
{
    T t;
    //这个T成为了连接,很微妙
    public <F extends IClassFactory<T>>CreateX(F factory)
    {
        t = factory.create();
    }
    public T getT()
    {
        return t;
    }
    public void setT(T t)
    {
        this.t = t;
    }
}