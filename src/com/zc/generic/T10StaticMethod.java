package com.zc.generic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class T10StaticMethod
{
    public static void main(String[] args)
    {
        List<String> list1 = ArrayUtils.myAsList("a", "b");
        
        //当不传入参数时,无法得知T类型,编译期设为T类型
        //下面两个等价
        List list21 = ArrayUtils.myAsList();
        List<Object> list22 = ArrayUtils.myAsList();
        
        //可指定为Integer类型.这样获取出来的就有Integer信息
        List<Integer> list23 = ArrayUtils.<Integer> myAsList();

        List<Number> list3 = ArrayUtils.<Number> myAsList(1, 1, 1.3);

        //1.静态方法有参数列表
        //调用静态泛型方法.方式一
        String a = T10StaticMethod.staticMethod("abc");
        
        //方式二
        Integer b = T10StaticMethod.<Integer> staticMethod(1);

        //2.若静态方法没有参数列表...
        //此时无法推测T类型,返回Object类型
        Object result = T10StaticMethod.staticNoArgMethod();
        //方式二
        Integer result2 = T10StaticMethod.<Integer> staticNoArgMethod();

        //调用非静态方法
        T10StaticMethod fan = new T10StaticMethod();
        String c = fan.normalMethod("hehe");
        String d = fan.<String> normalMethod("hah");
    }

    //静态方法
    public static <T> T staticMethod(T t)
    {
        System.out.println(t);
        return t;
    }

    public static <T> T staticNoArgMethod()
    {
        T t = null;
        return t;
    }

    public <T> T normalMethod(T t)
    {
        System.out.println(t);
        return t;
    }
}

class ArrayUtils
{
    public static <T> List<T> myAsList(T... t)
    {
        List<T> list = new ArrayList<T>();
        Collections.addAll(list, t);
        return list;
    }
}
