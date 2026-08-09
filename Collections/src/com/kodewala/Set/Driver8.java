package com.kodewala.Set;
import java.util.*;

/*
 -> Here it will give the error becuase :
 	-> we are not implementing the comparable and comparator methods
 	-> becuase it wont know right with whom i should compare like that
 */

class Personnnn {
	
	
}

public class Driver8 {

	public static void main(String[] args) {


		TreeSet<Personnnn> ts = new TreeSet<Personnnn>();
		
		Personnnn p1 = new Personnnn();
		Personnnn p2 = new Personnnn();
		Personnnn p3 = new Personnnn();
		Personnnn p4 = new Personnnn();
		
		ts.add(p1);
		ts.add(p2);
		ts.add(p3);
		ts.add(p4);
		
		System.out.println(ts);
	}

}
