package com.bellinfo.batch5.session6.variables;

public class MethodOverridingConcept {

	public static void main(String[] args) {
		
		Engine e = new Engine();
		e.method1(10);
		// Engine e1 = new Train(); subclass reference var can't hold super class object
		Train t = new Train();
		t.method1(10);
		Train t1 = new Engine();//super class ref var can hold subclass object
		t1.method1(10);
		t1.method2();
		
	}
}

class Train{
	public void method1(int a){
		System.out.println("Inside method1 of Train");
	}
	
	public void method2(){
		System.out.println("Super method2");
	}
}

class Engine extends Train{
	public void method1(int b){
		System.out.println("Inside method1 of Engine");
	}
}