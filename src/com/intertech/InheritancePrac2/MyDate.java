package com.intertech.InheritancePrac2;

public class MyDate {

	// Member/instance variables (a.k.a.fields/properties/attributes)
	private byte day;
	private byte month;
	private short year;

	// Constructors:
	// 1. Same name as the class
	// 2. No return type
	// The no-args constructor
	public MyDate() {
		this(1, 1, 1900);
	}

	// Constructor that takes 3 arguments
	public MyDate(int m, int d, int y) {
		setDate(m, d, y);
	}

	// Methods
	public String toString() {
		return getMonth() + "/" + getDay() + "/" + getYear();
	}

	public void setDate(int m, int d, int y) {
		if (valid(d, m, y)) {
			setDay((byte) d);
			setYear((short) y);
			setMonth((byte) m);
		}
	}

	public static void leapYears() {
		for (int i = 1752; i <= 2020; i = i + 4) {
			if (((i % 4 == 0) && (i % 100 != 0)) || (i % 400 == 0))
				System.out.println("The year " + i + " is a leap year");
		}
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		if (valid(day, getMonth(), getYear())) {
			this.day = (byte) day;
		}
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if (valid(getDay(), month, getYear())) {
			this.month = (byte) month;
		}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if (valid(getDay(), getMonth(), year)) {
			this.year = (short) year;
		}
	}

	public boolean equals(Object o) {
		boolean result = false;
		if (o instanceof MyDate) {
			MyDate temp = (MyDate) o;
			result = (temp.getDay() == getDay()) && (temp.getMonth() == getMonth()) && (temp.getYear() == getYear());
		}
		return result;
	}

	private boolean valid(int day, int month, int year) {
		if (day > 31 || day < 1 || month > 12 || month < 1) {
			System.out.println("Attempting to create a non-valid date " + month + "/" + day + "/" + year);
			return false;
		}
		switch (month) {
		case 4:
		case 6:
		case 9:
		case 11:
			return (day <= 30);
		case 2:
			return day <= 28 || (day == 29 && year % 4 == 0);
		}
		return true;
	}

	public void setDay(byte day) {
		this.day = day;
	}

	public void setYear(short year) {
		this.year = year;
	}

	public void setMonth(byte month) {
		this.month = month;
	}
}
