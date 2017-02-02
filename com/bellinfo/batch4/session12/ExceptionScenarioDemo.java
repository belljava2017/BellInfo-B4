package com.bellinfo.batch4.session12;

import java.util.Scanner;

public class ExceptionScenarioDemo {
	static int arry[] = new int[2];
	public static void main(String[] args) {
		boolean isZero = true;
		try{
			for(;;);
			
		}catch(ArithmeticException e){
			System.out.println("Enter a non zero value");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array overflow.Size of th eArray is "+arry.length);
		}catch(Exception e){
			System.out.println("Someting wrong happened.Will look in to it");
		}
		finally{
			System.out.println("I'm inside finally");
		}
		
		
	}

}
