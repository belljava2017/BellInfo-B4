package com.bellinfo.batch4.session14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class DuplicateEliminationHashSetDemo {

	public static void main(String[] args) {
		ArrayList<Phone> al = new ArrayList<>();
		Phone ph1 = new Phone();
		ph1.setName("Samsung");
		ph1.setCost(350.00);
		ph1.setOs("Android");
		
		Phone ph2 = new Phone();
		ph2.setName("Iphone");
		ph2.setCost(450.00);
		ph2.setOs("IOS");
		
		Phone ph3 = new Phone();
		ph3.setName("Samsung");
		ph3.setCost(350.00);
		ph3.setOs("Android");
		
		Phone ph4 = new Phone();
		ph4.setName("Nokie");
		ph4.setCost(550.00);
		ph4.setOs("Android");
		
		al.add(ph1);
		al.add(ph2);
		al.add(ph3);
		al.add(ph4);
		Collections.sort(al);
		
		for(Phone ph:al){
			System.out.println("Name:: "+ph.getName()+" cost:: "+ph.getCost()+" OS:: "+ph.getOs());
		}

	}

}

class Phone implements Comparable<Phone> {
	private String name;
	private double cost;
	private String os;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	@Override public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(cost);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((os == null) ? 0 : os.hashCode());
		return result;
	}
	@Override 
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Phone other = (Phone) obj;
		if (Double.doubleToLongBits(cost) != Double
				.doubleToLongBits(other.cost))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (os == null) {
			if (other.os != null)
				return false;
		} else if (!os.equals(other.os))
			return false;
		return true;
	}
	
	@Override 
	public int compareTo(Phone o) {
		Double d1 = new Double(this.getCost());
		Double d2 = new Double(o.getCost());
		return d1.compareTo(d2);
		/*int result = this.name.compareTo(o.getName());
		return result;*/
	}
	
}