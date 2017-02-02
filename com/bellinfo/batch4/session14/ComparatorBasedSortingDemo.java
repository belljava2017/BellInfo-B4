package com.bellinfo.batch4.session14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorBasedSortingDemo {

	public static void main(String[] args) {
      Movie m1 = new Movie();
      Movie m2 = new Movie();
      Movie m3 = new Movie();
      Movie m4 = new Movie();
      
      m1.setName("Khaidi150");
      m1.setLanguage("Telugu");
      m1.setRating(5);
      
      m2.setName("GPSK");
      m2.setLanguage("Telugu");
      m2.setRating(4);
      
      m3.setName("DANGAL");
      m3.setLanguage("Hindi");
      m3.setRating(2);
      
      m4.setName("SULLY");
      m4.setLanguage("ENGLISH");
      m4.setRating(5);
		
      List<Movie> movieList = new ArrayList<>();
      movieList.add(m1);
      movieList.add(m2);
      movieList.add(m3);
      movieList.add(m4);
      
      System.out.println("*** Before sorting ****");
      for(Movie m:movieList){
    	  System.out.println(m);
      }

      Collections.sort(movieList, new RatingBasedCriteria());
      Collections.sort(movieList, new NameBasedCriteria());
      System.out.println("*** After Sorting ****");
      for(Movie m:movieList){
    	  System.out.println(m);
      }
      
      
	}

}
