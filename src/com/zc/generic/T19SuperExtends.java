package com.zc.generic;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

//协变extends,与逆变super
public class T19SuperExtends
{
    @Test
    public void test01()
    {
        Number num = new Integer(1);
        
        //type mismatch编译期报错.类型不匹配
        //ArrayList<Number> list = new ArrayList<Integer>(); 

        //一旦类型确定之后,
        //注意,就算此时为List<? extends Number> list1 = new ArrayList<Integer>();new Integer(1)也放不进去
        //因为<? extends Number> 表示list持有的类型 为 在Number与Number子类中的某一类型.!!又没指定为Integer类型,所以放不进去
        List<? extends Number> list1 = new ArrayList<Number>();
        list1.add(null);
        //list1.add(new Integer(1)); //error
        //list1.add(new Float(1.2f));  //error
        
        //<? super Number>表示 list所持有的类型为 在Number与Number的基类  中的某一类型
        //其中Integer 与 Float必定为 这其中某一类型的子类.所以可以正确add
        List<? super Number> list2 = new ArrayList<Number>();
        list2.add(null);
        list2.add(new Integer(1));
    }
}

class Stack<E>
{
    public Stack()
    {
        
    }
    
    public void push(E e)
    {
        
    }
    
    public void pushAll(Iterable<? extends E> src)
    {
        for(E e : src)
        {
            push(e);
        }
    }
    
    public E pop()
    {
        return null;
    }
    
    public boolean isEmpty()
    {
        return false;
    }
    
    
}
