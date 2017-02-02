package com.bellinfo.batch4.session12;

import java.util.Scanner;

public class ExceptionBasic {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a value");
		int a = scan.nextInt();
		System.out.println("enter b value");
		int b = scan.nextInt();
		int c=a/b;
		System.out.println("Result "+c);
		System.out.println("After Results - contnuing");

	}

}
