package com.bellinfo.batch4.session13;

public class CardInvalidException extends RuntimeException {
	String number;
	CardInvalidException(){
		System.out.println("Something went wrong...");
	}
	CardInvalidException(String input){
		number = input;
		System.out.println("Something went wrong...");
	}
	
	public String toString(){
		if(number !=null){
			return "Card Number must be 16. But you provided of size,"+number.length();
		}
		return "You need to provdie input";
	}
	
}
