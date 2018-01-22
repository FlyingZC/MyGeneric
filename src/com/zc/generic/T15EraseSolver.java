package com.zc.generic;

import org.junit.Test;

//解决擦除信息后不能new T()
public class T15EraseSolver
{
    @Test
    public void test01()
    {
        ClassFactory instance1 = new ClassFactory(this.getClass());
        //java.lang.InstantiationException: java.lang.Integer 但是Integer类不能使用反射实例化,因为它没有无参构造方法
        ClassFactory int1 = new ClassFactory(Integer.class);
    }
}

//创建 泛型对象
class ClassFactory<T>
{
    T t;

    //构造方法
    ClassFactory(Class<T> clazz)
    {
        try
        {
            t = clazz.newInstance();
        }
        catch (InstantiationException | IllegalAccessException e)
        {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
