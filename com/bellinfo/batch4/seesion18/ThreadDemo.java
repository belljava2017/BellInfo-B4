package com.bellinfo.batch4.seesion18;

public class ThreadDemo {

	public static void main(String[] args) {
		Thread t1 = new MyThread("Java");
		Thread t2 = new MyThread("sql");

	}

}

class MyThread extends Thread{
	String name;
	static int a=0;
	
	MyThread(String name){
	   	setName(name);
	   	start();
	}
	
	public void run(){
		for(int i=0;i<=10;i++){
			a++;
			System.out.println(getName() +" "+ a);
			try {
				if(getName().equals("XXX")){
				Thread.sleep(1000);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
}
