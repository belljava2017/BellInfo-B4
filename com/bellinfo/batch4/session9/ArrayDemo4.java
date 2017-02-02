package com.bellinfo.batch4.session9;

import java.util.Scanner;

public class ArrayDemo4 {
	public static void main(String[] args) {
		int[] a = new int[2];
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter Netflix size");
      int size = scan.nextInt();
      Movies netflix[] = new Movies[size];
      for(int i=0;i<=size-1;i++){
    	 Movies m1 = new Movies();
    	 System.out.println("Enter Name of the movie:");
    	 m1.setName(scan.next());
    	 System.out.println("Enter category:");
    	 m1.setCategory(scan.next().charAt(0));
    	 System.out.println("Enter cost of the movie");
    	 m1.setAmount(scan.nextDouble());
    	 netflix[i] = m1;
      }     
      System.out.println("**** Netflix DataCenter ****");
      System.out.println("Name\tCatergeory\tamount");
      Movies movie = new Movies();
      for(int i=0;i<=size-1;i++){
    	  movie = netflix[i];
    	  System.out.println(movie.getName()+"\t"+movie.getCategory()+"\t"+movie.getAmount());
      }
	}
}

class Movies{
	private String name;
	private char category;
	private double amount;
	public String getName() {
		return name;
	}
	public void setName(String name1) {
		this.name = name1;
	}
	public char getCategory() {
		return category;
	}
	public void setCategory(char category1) {
		this.category = category1;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount1) {
		this.amount = amount1;
	}
}