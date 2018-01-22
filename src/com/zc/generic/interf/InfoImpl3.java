package com.zc.generic.interf;

//方式二中:可采用多个泛型参数
public class InfoImpl3<T, U> implements Info<T>
{

    @Override
    public T getVar()
    {
        return null;
    }

    @Override
    public void setVar(T t)
    {

    }

}
