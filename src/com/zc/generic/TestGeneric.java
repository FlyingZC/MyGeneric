package com.zc.generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

import com.zc.generic.Test02GenericClass.InnerClass;

//若类A是类B的子类.但类List<A>不是List<B>的子类
public class TestGeneric {
	//测试自定义泛型类
	@Test
	public void test0(){
		//当不指名具体类型.默认类型为Object
		Test02GenericClass<Integer> genericClass=new Test02GenericClass<>();
		//泛型方法传入的参数类型可以与所在的泛型类不同.因为定义了两个不同的泛型
		genericClass.getE("hehe");
	
	}
	
	public void test1(){
		List<Integer> list1=new ArrayList<Integer>();
		list1.add(1);
		
		for(int i=0;i<list1.size();i++){
			int score=list1.get(0);
			System.out.println(score);
		}
		
		Iterator<Integer> iterator=list1.iterator();
		while(iterator.hasNext()){
			iterator.next();
		}
	}
	
	@Test
	public void test2(){
		Map<Integer,Object> map1=new HashMap<Integer,Object>();
		map1.put(1,"hehe");
		map1.put(2,"haha");
		map1.put(3,"heha");
		map1.put(4, "hh");
		
		/*Set<Entry<Integer, Object>> e = map1.entrySet();
		//Entry类型是Map的内部类
		Iterator<Entry<Integer, Object>> iterator = e.iterator();
		
		while(iterator.hasNext()){
			Integer key = iterator.next().getKey();
			Object value = iterator.next().getValue();
			System.out.println(key+"-->"+value);
		}
		*/
		
		
		Iterator<Entry<Integer, Object>> it=map1.entrySet().iterator();
		while(it.hasNext())
		{
			Entry<Integer, Object> entry=it.next();
			System.out.println(entry.getKey()+"->"+entry.getValue());
			
		}
		
		
	}
	
	
	
}
