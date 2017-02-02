package com.bellinfo.batch5.session6.variables;

public class StaticExampleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

final class StaticSample{
	
	final int a =10;
	static int b =20;
	
	static{
		System.out.println("Inside static block");
		
	}
	
	public final void nonStaticMtd(){
		System.out.println("NonStatic");
		staticMethod();
		b=50;
		b=a;
	}
	
	public static void staticMethod(){
		System.out.println("Static");
		b=90;
		//a=23; Non Static members not allowed
		//nonStaticMtd();Non Static members not allowed
		StaticSample ss = new StaticSample();
		ss.a =100;
		ss.nonStaticMtd();
	}
	
	
}