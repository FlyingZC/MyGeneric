package com.zc.generic;

import java.util.ArrayList;
import java.util.List;

public class T09New
{

}

class Foo<T>
{
    //泛型信息会在编译期擦除,所以new T(),T被擦除后成什么了?
    //new T[5]:T在擦除后成什么了
    //编译报错
    //private T t=new T();
    //private T[] arr=new T[5];
    private List<T> list = new ArrayList<T>();

}
