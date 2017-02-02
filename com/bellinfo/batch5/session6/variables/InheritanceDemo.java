package com.bellinfo.batch5.session6.variables;

public class InheritanceDemo {

	public static void main(String[] args) {
		B objB= new B();
		//System.out.println(objB.a);
		objB.mtdA();
	}
}

class A {
	A(){
	 System.out.println("Inside constructor");	
	}
	private int a =20;
	
	void mtdA(){
		System.out.println("inside mtd A");
	}
}
class B extends A {
	void mtdB(){
		//System.out.println(a);
		System.out.println("inside mtd B");
	}
}