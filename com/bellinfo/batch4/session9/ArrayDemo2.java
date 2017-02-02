package com.bellinfo.batch4.session9;

import java.util.Scanner;

public class ArrayDemo2 {
	public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int[] a = new int[4];		
      double[] dub = new double[12];
      System.out.println(a.length);
      for(int i=0; i<=4; i++){
    	  a[i] = scan.nextInt();
      }
      for(int j=0;j<=a.length-1;j++){
    	  System.out.println(a[j]);
      }
      
	}

}
