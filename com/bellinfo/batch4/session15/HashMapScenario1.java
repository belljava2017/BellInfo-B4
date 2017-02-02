package com.bellinfo.batch4.session15;

import java.util.Collections;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapScenario1 {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(1, "Orange");
		hm.put(2, "Apple");
		hm.put(3, "Pears");
		hm.put(4, "Banana");
		hm.put(5, "WaterMelon");
		hm.put(2, "DifferentApple");
		hm.put(6, "Banana");
		hm.put(null,  "sasasa");
		hm.put(7, null);
		hm.put(8, null);
		//HashMap doesn't allow duplicate key. All keys are the collection of SET 
		//and SET doesn't allow duplicates.
		//HashMap allows duplicate values
		//HashMap doesn't allow null keys and allows null value
		//By default hashMap is not synchronized
		//if you want to make hashMap synchronized then you need use
		Collections.synchronizedMap(hm);
		
		//instead of HashMap use concurrent hashMap
		ConcurrentHashMap<Integer, String> chm = new ConcurrentHashMap<Integer, String>();
		
		Set<Integer> set = hm.keySet();
		for(Integer i:set){
			System.out.println("Key "+i+ " value "+hm.get(i));
		}
		
		HashMap<String,WebSite> hm = HashMap<>();
		
		
	}

}
