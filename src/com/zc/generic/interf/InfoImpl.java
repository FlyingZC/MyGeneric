package com.zc.generic.interf;
//方式一:使用非泛型类 实现 泛型接口 此时泛型接口指定类型
public class InfoImpl implements Info<String>{
	//返回值类型已经确定
	@Override
	public String getVar() {
		return null;
	}

	@Override
	public void setVar(String t) {

	}
}
