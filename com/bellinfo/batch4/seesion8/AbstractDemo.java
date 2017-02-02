package com.bellinfo.batch4.seesion8;

public class AbstractDemo {
	public static void main(String[] args){
		Car carObj;
		Vehicle vehObj;
		carObj = new HondaV6();
		carObj.engineType();
		carObj.wheelsCount();
		carObj.runsOn();
		System.out.println(carObj.abcd);
	}
}

interface Vehicle{
	int abcd=20; 
	void engineType();
	void runsOn();
	void wheelsCount();
}
abstract class Car implements Vehicle{
	int a=10;
	public abstract void runsOn();
	public abstract void engineType();
	public void wheelsCount(){
		System.out.println("wheels count "+4);
	}
}
abstract class Honda extends Car{
	public void runsOn() {
		System.out.println("Gas");		
	}
}

class HondaV6 extends Honda{
	public void engineType() {
		System.out.println("V6 Engine");
	}
}
