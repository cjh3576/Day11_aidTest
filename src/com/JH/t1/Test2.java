package com.JH.t1;

public class Test2 {
	private Test1 t1;
	public Test2() {
		t1 = new Test1();
	}
	public void t2() {
		System.out.println(t1.sum(1, 2));
	}
	
}
