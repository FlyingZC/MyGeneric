package com.zc.generic;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class T11WildCard
{
    @Test
    public void testRead()
    {
        List<Number> list = new ArrayList<Number>();
        list.add(1);
        list.add(1L);
        list.add(20.0F);
        list.add(20.0D);
        read(list);
    }

    //1.读时,使用extends
    public static <E> void read(List<? extends E> list)
    {
        for (E e : list)
        {
            System.out.println(e);
        }
    }

    public static <E> void read2(List<? super E> list)
    { 
        //若用super
        //此时不能用E e:list.因为编译期还未调用该方法不知道E类型的父类型是什么
        for (Object e : list)
        {
            System.out.println(e);
        }
    }

    //2.写,用super.这个方法使用extends的不行,是反例
    public static void write(List<? extends Number> list)
    {
        //存入时编译期无法推断到底是存入Integer还是Double等等
        list.add(null);
        //编译期报错,编译期发现想要放入123这个Integer类型,但是运行期调用该方法时,(可能)若传入了List<Double>,岂不是要出问题.所以编译期报错
        //list.add(123);
    }

    //写,用super,可以
    public static void write2(List<? super Number> list)
    {
        list.add(123);
    }

    //copy,对读extends,对写super
    public static <T> void copy(List<? extends T> src, List<? super T> dest)
    {
        for (int i = 0; i < src.size(); i++)
            dest.set(i, src.get(i));
    }

    //又读又写,直接用List<E>
    public static <T> List<T> readAndWrite(List<T> list)
    {
        return list;
    }

    //List<?>为只读类型.不能增加,修改.
    //List<?>读出来的元素类型都是Object类型
    public static void test(List<?> list)
    {
        //list.add(1);
        Object a = list.get(0);
    }

    public static void testTest()
    {
        test(new ArrayList<String>());
    }

    @Test
    public void testArrCast()
    {
        Object[] objs = {"a", "b"};
        //ClassCastException
        //String[] strArr=(String[])objs;

        String[] s = {"a", "b"};
        //Object[]数组实际类型为String[]时即可强转为String[]
        Object[] objs2 = s;
        String[] strs = (String[]) objs2;
    }

    /** <一句话功能简述>
     * <功能详细描述>
     * @param list
     * @param clazz 传入的数组的Class类型
     * @return
     * @see [类、类#方法、类#成员]
     */
    public static <T> T[] toArray(List<T> list, Class<T> clazz)
    {
        //声明并初始化一个T类型的数组
        @SuppressWarnings("unchecked")
        T[] t = (T[]) Array.newInstance(clazz, list.size());
        for (int i = 0; i < list.size(); i++)
            t[i] = list.get(i);
        return t;
    }

    public static <T> T[] toArray2(List<T> list)
    {
        @SuppressWarnings("unchecked")
        //这句相当于Object[] t=(Object[])new Object[list.size()];即强转没有意义
        T[] t = (T[]) new Object[list.size()];
        for (int i = 0; i < list.size(); i++)
            t[i] = list.get(i);
        return t;
    }

    @Test
    public void testToArray()
    {
        T11WildCard.toArray(new ArrayList<String>(), String.class);
    }
}
