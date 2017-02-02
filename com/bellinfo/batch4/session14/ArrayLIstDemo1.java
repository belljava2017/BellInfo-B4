package com.bellinfo.batch4.session14;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLIstDemo1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

        System.out.println("Provide the number of sites");
        int size =scan.nextInt();
        scan.nextLine();
        System.out.println("size::"+size);
        ArrayList<WebSite> webList = new ArrayList<>(30);
        System.out.println("webList size" + webList.size());
        for(int i=0;i<=3;i++){
        	WebSite site = new WebSite();
        	System.out.println("Name of the site::");
        	String name = scan.nextLine();
        	site.setName(name);
        	System.out.println("Pupose::");
        	String purpose = scan.nextLine();
        	site.setPurpose(purpose);
        	System.out.println("Value::");
        	double value =scan.nextDouble();
        	site.setValue(value);
        	webList.add(site);
        }
		
        for(WebSite wb:webList){
        	System.out.println("Site Name:"+wb.getName() + " used for "+wb.getPurpose()
        			+ " and it value in the market "+wb.getValue());
        }
		
		
	}
}

class WebSite{
	private String name;
	private double value;
	private String purpose;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	
	
}
