package com.zc.generic.z02;

public class StaticFan {
	//静态方法
	public static <T> void staticMethod(T t){
		System.out.println(t);
	}
	
	//
	public <T> void normalMethod(T t){
		System.out.println(t);
	}
	
	public static void main(String[] args) {
		//调用静态泛型方法.方式一
		StaticFan.staticMethod("abc");
		//方式二
		StaticFan.<Integer>staticMethod(1);
		
		//调用非静态方法
		StaticFan fan=new StaticFan();
		fan.normalMethod("hehe");
		fan.<String>normalMethod("hah");
	}
}
