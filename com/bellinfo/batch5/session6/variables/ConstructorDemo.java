package com.bellinfo.batch5.session6.variables;

public class ConstructorDemo {

	public static void main(String[] args) {
		BMW bmwObj = new BMW(10);
		
	}

}

class Car{
	Car(){
		System.out.println("Default Constructor");
	}
	Car(int a){
		System.out.println("Car 1 arg int Constructor");
	}
}
class BMW extends Car{
	BMW(){
		super();
		System.out.println("I'm BMW default constructor");
	}
	BMW(int a){
		System.out.println("BMW 1 arg int Constructor");
	}
}