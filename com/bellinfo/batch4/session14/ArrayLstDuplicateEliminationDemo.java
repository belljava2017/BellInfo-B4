package com.bellinfo.batch4.session14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class ArrayLstDuplicateEliminationDemo {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList();
		al.add("yellow");
		al.add("purpule");
		al.add("purpule");
		al.add("yellow");
		al.add("White");
		al.add("Red");
		al.add("green");
		System.out.println("Inside ArrayList");
		for(String color:al){
			System.out.println(color);
		}
		HashSet<String> hs = new HashSet<>();
		hs.addAll(al);
		System.out.println("**********Inside HashSet");
		for(String color:hs){
			System.out.println(color);
		}
		
		TreeSet<String> ts = new TreeSet<>();
	    ts.add("white");
	    ts.add("yellow");
	    ts.add("green");
		System.out.println("*********** Inside TreeSet");
		for(String color:ts){
			System.out.println(color);
		}
		
		
		
	}

}
