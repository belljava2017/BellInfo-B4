package com.bellinfo.batch4.session17;

enum Week {
	SUNDAY, MONDAY,
	TUESDAY, WEDNESDAY,
	THURSDAY, FRIDAY, SATURDAY;
}
public class EnumDemo{
	final String day = "SUNDAY";
	public static void main(String[] args){
		Week[] weekDays = Week.values();
		for(int i=0;i<weekDays.length;i++){
			System.out.println(weekDays[i]);
		}
	}
	
}






