package com.zc.generic;

//The generic class T07Erase<T> may not subclass java.lang.Throwable
//泛型类不能继承自Throwable
public class T07Erase<T>
/*extends Exception*/ 
{
    private T t;

    public T getErase()
    {
        return t;
    }

    public static void main(String[] args)
    {
        T07Erase<String> e = new T07Erase<String>();
        //编译器会调用e.getErase(),并将返回的Object类型 自动强转为 String类型
        String s = e.getErase();

        //做泛型instanceof判断时,只能判断出e是否是 T07Erase 类型
        if (e instanceof T07Erase<?>)
        {
            System.out.println("true");
        }

        //class com.zc.generic.T07Erase
        System.out.println(e.getClass());

        T07Erase[] es = new T07Erase[10];

        //非法
        //T07Erase[]<String> es=new T07Erase<String>[10];
    }
}
