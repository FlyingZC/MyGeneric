package com.zc.generic;

import java.util.ArrayList;
import java.util.List;

public class Test02GenericClass<T> {
	private String name;
	private int id;
	private T t;
	List<T> list=new ArrayList<T>();
	
	//自定义泛型方法.类型与泛型类中的<T>类型不同
	
	public <E> E getE(E e){
		return e;
	}
	
	public <F> void setF(F f){
	
	}
	
	public <E> List<E> getEList(E e){
		return null;
	}
	
	
	public T getT(){
		return t;
	}
	public void setT(T t){
		this.t=t;
	}
	
	public void addToList(){
		list.add(t);
	}
	
	//内部类可以继承外部类.可以不指定具体使用的泛型
	class InnerClass<T> extends Test02GenericClass<T>{
	
	}
	//也可以指定泛型
	class InnerClass2 extends Test02GenericClass<Integer>{
		
	}
	

}
