package com.enthuware.Test;

public interface Account {
	public default String getId() {
		return "0000";
	}

}

interface PremiumAccount extends Account {
// will not work because the overridden method is default,
// will only work if overridden method was static
// static String getId() {
//	return "1111";
//}

//Will work 
//   default String getId() {
//		return "1111";
//	}

	String getId();
}
