package io;

import java.io.Serializable;
//객체 직렬화를 위한 인터페이스 구현
public class Data implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 809064067131312475L;
	int num;
	double dnum;
	String str;
	
	
	public Data() {
		super();
	}
	public Data(int num, double dnum, String str) {
		super();
		this.num = num;
		this.dnum = dnum;
		this.str = str;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public double getDnum() {
		return dnum;
	}
	public void setDnum(double dnum) {
		this.dnum = dnum;
	}
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	@Override
	public String toString() {
		return "Data [num=" + num + ", dnum=" + dnum + ", str=" + str + "]";
	}
	
	
}
