package com.bellinfo.batch4.session12;

public class GarbageCollectorDemo {

	public static void main(String[] args) {
              System.out.println("Garbage Example");
              callJetEngine();
              System.gc();
              Runtime.getRuntime().gc();
              System.out.println("Running GC Example");
              System.out.println("Completed");
	}
	static void callJetEngine(){
		JetEngine je1 = new JetEngine();
        JetEngine je2 = new JetEngine();
        
	}
}

class JetEngine{
	int a=10;
	double d =20.0;
	void mtd(){
		System.out.println("DASAS");
	}
}