package com.zc.generic;

import java.util.HashMap;
import java.util.Map;

public class T08Favorites
{
    public static void main(String[] args)
    {
        Fav f = new Fav();
        f.putFav(String.class, "abstr");
        f.putFav(Integer.class, 1111);
        f.putFav(Class.class, Fav.class);

        String s = f.getFav(String.class);
        int i = f.getFav(Integer.class);
        Class<?> favClazz = f.getFav(Class.class);
        System.out.println(s);
        System.out.println(i);
        System.out.println(favClazz);
    }
}

class Fav
{
    //键可以是不同类型
    private Map<Class<?>, Object> favMap = new HashMap<Class<?>, Object>();

    public <T> void putFav(Class<T> type, T instance)
    {
        if (type == null)
            throw new NullPointerException("Type is null");
        //Class<T>中的方法cast(),将一个对象强制转换成此 Class对象所表示的类或接口
        favMap.put(type, type.cast(instance));
    }

    public <T> T getFav(Class<T> type)
    {
        //Class中的方法,将Object类型cast为T类型
        return type.cast(favMap.get(type));
    }
}
