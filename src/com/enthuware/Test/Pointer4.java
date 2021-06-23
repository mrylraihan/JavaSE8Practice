package com.enthuware.Test;

import java.util.ArrayList;
import java.util.List;

public class Pointer4 {
	public static void main(String[] args) {
		List s1 = new ArrayList( );
	      s1.add("a");
	      s1.add("b");
	      s1.add(1, "c");
	      List s2 = new ArrayList(  s1.subList(1, 2) );
	      s1.addAll(s2);
	      System.out.println(s1);
	}

}
