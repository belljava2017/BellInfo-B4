package com.bellinfo.batch4.session13;

public class ThrowsDemo {
	public static void main(String[] args) {
		method1();
	}
	static void method1(){
		int a=40;
		int b=0;
		int result=0;
		try{
			result =method2(a,b);
		}catch(ArithmeticException ae){
			System.out.println("Bad Input");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array index overflow");
		}catch(Exception e){
			System.out.println("Somethind wrong");
		}
		System.out.println("Result "+result);
		
	}
	static int method2(int x, int y) throws Exception {
		int c=0;
		
		 c = x/y;
		 int[] a= new int[1];
		 a[0]=12;
		 a[1]=23;
		 
		return c;
		
	}
}
