package com.acme.domain;

import com.acme.utils.MyDate;

public interface Rushable {
	boolean isRunnable(MyDate orderDate, double amount);

}
