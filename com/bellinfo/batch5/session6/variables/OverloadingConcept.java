package com.bellinfo.batch5.session6.variables;

public class OverloadingConcept {

	public static void main(String[] args) {
		Bus bus = new Bus();
		bus.method1(10);
		bus.method1("text");
	}
}

class Bus{
	public int method1(int a, String b){
		System.out.println("inside vehicle");
		return 0;
	}	
	public void method1(String b, int a){
		System.out.println("inside Bus");
	}	
}