package com.bellinfo.batch4.session14;

import java.util.Comparator;

public class RatingBasedCriteria implements Comparator<Movie>{

	@Override public int compare(Movie o1, Movie o2) {
		return o1.getRating()-o2.getRating();
	}


}
