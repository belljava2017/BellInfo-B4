package com.bellinfo.batch4.session4.oopc;

public class Car {
   int gear;
   static int numberOfSeats = 4;
   boolean isBatteryEngine;
   String carName;
   
   public void maxGear(int value){
	   gear = value;
   }
   
   public void incrementSeats(int number){
	   numberOfSeats = numberOfSeats + number;
   }
   
   public void provideCarName(String name){
	   carName = name;
   }
   
   void printCarDetails(){
	   System.out.println("Car Details:: car name: " + carName 
			   +" number of seats:"+ numberOfSeats
			   + " max gears : "+  gear);
  
   }
	
	
}

