package com.globallogic.java8.defaultmethod;

public class DefaultMethodImpl implements DefaultInterface2 , DefaultInterface3{

	public static void main(String []args) {
		DefaultMethodImpl d=new DefaultMethodImpl();
		d.extend1();
	}
	//Specifically Call implementation by overriding
	public  void extend1() {
		DefaultInterface2.super.extend1();
	}
}
