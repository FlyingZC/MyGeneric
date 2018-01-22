package com.zc.generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class T12
{
    static void f(Map<String, String> arg)
    {
        
    }
    
    public static void main(String[] args)
    {
        //泛型 的 类型推断 只对赋值操作有效,其它时候不起作用.
        //编译器 认为 NewUtils.map() 返回 Object类型
        //f(NewUtils.map());
        //显式指明泛型类型
        f(NewUtils.<String,String>map());
    }
}

/**
 * 工具类,返回泛型 集合
 */
class NewUtils
{
    public static <T> List<T> list()
    {
        return new ArrayList<T>();
    }
    
    public static<K,V> Map<K,V> map()
    {
        return new HashMap<K,V>();
    }
}
