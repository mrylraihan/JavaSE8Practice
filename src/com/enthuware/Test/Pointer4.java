package com.enthuware.Test;

import java.util.ArrayList;
import java.util.List;

public class Pointer4 {
	public static void main(String[] args) {
		List<String> s1 = new ArrayList<>( );
	      s1.add("a");
	      s1.add("b");
	      s1.add(1, "c");
	      List<String> s2 = new ArrayList<>(  s1.subList(1, 2) );
	      //	subList(int fromIndex, int toIndex)
	     // Returns a view of the portion of this list between the specified fromIndex, inclusive, and toIndex, exclusive.
	      s1.addAll(s2);
	      System.out.println(s1);
	      
	      //Substring practice 
	      String name = "Wallie";
	      String name1 = name.substring(0, 1);
	      System.out.println(name1);
	      
	}

}
