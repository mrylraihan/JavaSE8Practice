package com.intertech.CollectionsMapsPractice;

import com.acme.utils.MyDate;

	public class MyDateEx implements Comparable{

		// Member/instance variables (a.k.a.fields/properties/attributes)
		private byte day;
		private byte month;
		private short year;

		// Constructors:
		// 1. Same name as the class
		// 2. No return type
		// The no-args constructor
	
		public MyDateEx() {
			this(1, 1, 1900);
		}

		// Constructor that takes 3 arguments
		public MyDateEx(int m, int d, int y) {
			setDate(m, d, y);
		}

		// Methods
		public String toString() {
			return month + "/" + day + "/" + year;
		}

		public void setDate(int m, int d, int y) {
			if (valid(d, m, y)) {
				day = (byte) d;
				year = (short) y;
				month = (byte) m;
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
			if (valid(day, month, year)) {
				this.day = (byte) day;
			}
		}

		public int getMonth() {
			return month;
		}

		public void setMonth(int month) {
			if (valid(day, month, year)) {
				this.month = (byte) month;
			}
		}

		public int getYear() {
			return year;
		}

		public void setYear(int year) {
			if (valid(day, month, year)) {
				this.year = (short) year;
			}
		}
		public boolean equals(Object o) {
			boolean result = false;
			if(o instanceof MyDate) {
				MyDate temp = (MyDate) o;
				result = (temp.getDay() == day)&&
						(temp.getMonth() == month)&&(temp.getYear()==year);
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

		@Override
		public int compareTo(Object o) {
			MyDateEx d = (MyDateEx) o;
			if (year !=d.year) {
				return year -d.year;
			}
			if (month != d.month) {
				return month -d.month;
			}
			if (day != d.day) {
				return day - d.day;
			}
			return 0;
		}
	}


