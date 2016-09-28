package com.zc.generic.z04WuBianJie;

public class Test {
	public static void main(String[] args) {
		Pointer<? extends Number> p;
		//p=new Pointer<String>();
		p=new Pointer<Integer>();
		p=new Pointer<Long>();
		p=new Pointer<Number>();
	}
}
