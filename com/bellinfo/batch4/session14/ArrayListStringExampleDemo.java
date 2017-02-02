package com.bellinfo.batch4.session14;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

import com.sun.media.sound.AlawCodec;

public class ArrayListStringExampleDemo {

	public static void main(String[] args) {
      Vector<String> al = new Vector<>();
      al.add("Purple");
      al.add("Red");
      al.add("Green");
      al.add("Yellow");
      al.add("Green");
      al.add(null);
      al.add(null);
      System.out.println(al.get(1));
      System.out.println(al.contains("Red"));
      System.out.println(al.size());
      
      System.out.println("traditional loop");
      for(int i=0;i<=al.size()-1;i++){
    	  System.out.print(al.get(i)+" ");
      }
      System.out.println();
      System.out.println("for-each loop");
      for(String str:al){
    	  System.out.print(str+" ");
      }
      System.out.println();
      System.out.println("Using Iterator");

      Iterator<String> itr =al.iterator();
      while(itr.hasNext()){
    	  System.out.print(itr.next()+" ");
      }
      
      
		
	}
	

}
