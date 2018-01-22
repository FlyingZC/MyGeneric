package com.zc.generic;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class T07Erase2
{

    @Test
    public void test01()
    {
        //List<Fruit> list = new ArrayList<Apple>();
        List<? extends Fruit> list = new ArrayList<Apple>();
        list = new ArrayList<Orange>();
        list = new ArrayList<RedApple>();
    }
    
    //逆变,超类型通配符<? super MyClass>或<? super T>,却不能声明成<T super MyClass>.
    void writeTo()
    {
        List<? super Apple> list = new ArrayList<Apple>();
        //一旦具体指定了类型,就只能放Apple或其子类型了
        //list.add(new Fruit());
        list.add(new RedApple());
        
    }
    
    void writeTo(List<? super Apple> list)
    {
        list.add(new Apple());
        list.add(new Fruit());
        
    }
}

class Fruit
{

}

class Orange extends Fruit
{

}

class Apple extends Fruit
{

}

class RedApple extends Apple
{

}
