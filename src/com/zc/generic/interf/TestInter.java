package com.zc.generic.interf;

public class TestInter
{
    public static void main(String[] args)
    {
        //class InfoImpl implements Info<String>
        InfoImpl i1 = new InfoImpl();//InfoImpl1书写时不再需要指明泛型
        System.out.println(i1);
        //面向接口Info
        Info<String> i11 = new InfoImpl();

        //class InfoImpl2<T> implements Info<T>
        Info<String> i2 = new InfoImpl2<String>();//InfoImpl2需要指定泛型
        i2.setVar("hehe");
        System.out.println(i2.getVar());
    }
}
