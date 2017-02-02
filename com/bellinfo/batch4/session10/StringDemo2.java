package com.bellinfo.batch4.session10;

public class StringDemo2 {

	public static void main(String[] args) {
		//String objects are immutable and String reference var are mutable
		//String buffers objets are mutable
		StringBuffer sb = new StringBuffer(); //synchronized, they will be slow but threadsafe
		StringBuilder sbd = new StringBuilder();//not synchronized, faster but not threadsafe
		sb.append("orange");
        sb.append(" ");
        sb.append("Apple");
        System.out.println(sb.length());
        
        System.out.println(sb);
		
		String s1 ="orange";
		String s2 ="orange";
		String s3 = new String("orange");
		System.out.println(s1.length());
		if(s1==s3){
			System.out.println("== both are same");
		} else {
			System.out.println("== both are not same");
		}
		if(s1.equals(s3)){
			System.out.println(".equals, both are same");
		}else {
			System.out.println(".equals, both are not same");
		}
		
	}

}
