package com.bellinfo.batch4.session14;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class CollectionsDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(8);
		al.add(0);
		System.out.println("Traditional for loop");
		for(int i=0;i<=al.size()-1;i++){
			Integer a =(Integer) al.get(i);
			System.out.print(a+" ");
		}
		System.out.println();
		System.out.println("Through for-each loop");
		for(Integer i:al){
			System.out.print(i + "");
		}
		//Iterator itr = (Iterator) al.iterator();
		

	}

}
