package com.zc.generic.z04WuBianJie;

public class Pointer<T> {
	private int x;
	private int y;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public Pointer(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public Pointer() {
		super();
	}
	@Override
	public String toString() {
		return "Pointer [x=" + x + ", y=" + y + "]";
	}
}
