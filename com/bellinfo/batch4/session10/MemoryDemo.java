package com.bellinfo.batch4.session10;

public class MemoryDemo {

	public static void main(String[] args) {
      Student std = new Student();
      std.rn =100;
      std.course="Java";
      Student std2 = new Student();
      
		
	}
}

class Student {
	int rn;
	String course;
	public void dsp(){
		int xyz=0;
		System.out.println("Student");
	}
	
}