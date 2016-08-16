package com.zc.generic.interf;

public class TestInter {
	public static void main(String[] args) {
		Info<String> info1=new InfoImpl2<String>();
		info1.setVar("hehe");
		System.out.println(info1.getVar());
	}
}
