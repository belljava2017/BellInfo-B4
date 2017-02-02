package com.bellinfo.batch4.session4.oopc;

public class CarDemo {
     
	public static void main(String[] args) {
		
		Car newCar = new Car();
		newCar.carName ="AudiCar";
        newCar.gear =5;  
        newCar.numberOfSeats =5;
        Car anotherCar = new Car();
        anotherCar.gear =10;
        anotherCar.numberOfSeats =10;
        
        System.out.println("New Car details:: "+newCar.gear +" " +newCar.numberOfSeats  );
        System.out.println("Anotheer Car details:: "+anotherCar.gear +" " +anotherCar.numberOfSeats  );
        
	}
	
	int a =20;
	static int b=30;
	public void nonstaticMethod(){
		a=30;
		b=50;
		staticMethod();
		System.out.println("I'm non static method");
	}
	
	
	public static void staticMethod(){
		b=70;
		CarDemo carD = new CarDemo();
		carD.a=60;
		carD.nonstaticMethod();
		System.out.println("I'm static Method");
		
	}
	
	
	
	
    
}
