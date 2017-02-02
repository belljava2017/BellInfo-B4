package com.bellinfo.batch4.session13;

import java.util.Scanner;

public class ThrowDemo {

	public static void main(String[] args) {
		try{
			System.out.println("Enter your card number to process the request");
			Scanner scan = new Scanner(System.in);
			String numb = scan.next();
			method1(numb);
			
		}catch(CardInvalidException cie){
			System.out.println(cie);
		}
	}
	static void method1(String number){
		if(number.length() == 16){
			System.out.println("Your card accepted. We'll process your request");
		}else{
			throw new CardInvalidException(number);
		}
	}
}
