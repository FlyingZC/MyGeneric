package com.zc.generic.interf;
//方式二:使用 泛型类 实现 泛型接口
public class InfoImpl2<T> implements Info<T> {
	private T t;
	@Override
	public T getVar() {
		// TODO Auto-generated method stub
		return t;
	}

	@Override
	public void setVar(T t) {
		// TODO Auto-generated method stub
		this.t=t;
	}

}
