package com.intertech.CollectionsCompares2;

import java.util.Comparator;

public class UserPassWComparator implements Comparator<Users>{

	@Override
	public int compare(Users o1, Users o2) {
		//Sorts passwords in reveres order
		return o2.getPassword().compareTo(o1.getPassword());
	}

}
