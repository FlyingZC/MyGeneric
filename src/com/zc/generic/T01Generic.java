package com.zc.generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

//若类A是类B的子类.但类List<A>不是List<B>的子类
public class T01Generic
{
    //测试自定义泛型类
    @Test
    public void test01()
    {
        //当不指名具体类型.默认类型为Object
        T02GenericClass<Integer> genericClass = new T02GenericClass<>();
        //泛型方法 传入的参数类型  可以 与所在的泛型类  不同.因为  定义了  两个  不同的泛型
        System.out.println(genericClass.getE("hehe"));

    }

}
