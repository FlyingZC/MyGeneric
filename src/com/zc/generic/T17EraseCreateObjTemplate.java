package com.zc.generic;
//模板方法 泛型 创建对象
public class T17EraseCreateObjTemplate
{

}

abstract class CreateObj<T>
{
    T t;
    public CreateObj()
    {
        create();
    }
    //抽象方法 创建泛型对象 由子类实现
    abstract T create();
}

class CreateObjImpl extends CreateObj<Integer>
{

    @Override
    Integer create()
    {
        return 1;
    }
    
}