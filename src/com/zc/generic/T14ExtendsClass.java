package com.zc.generic;

public class T14ExtendsClass
{
    
}

class A<T>
{
    private T obj;
    public void me01()
    {
        //obj.eat();
    }
}

//加上extends后,编译器才能知道有eat()方法,即 <T extends Dog>声明T必须具有类型Dog 或者 是从Dog导出的类型
class B<T extends Dog>
{
    private T obj;
    public void me01()
    {
        obj.eat();
    }
}

class Dog
{
    public void eat()
    {
        
    }
}