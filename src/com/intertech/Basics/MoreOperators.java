package com.intertech.Basics;

public class MoreOperators {
	public static void main(String[] args) {
//		Boolean Operators
//		These operators, which return true or false, were mentioned in the Operators Part 1 lecture,
		// but let's go over a few more examples. To start, each of the examples will
		// use the following variables:

		boolean courseInSession = true;
		int lectureCount = 150;
//		! is the "logical complement" operator.  It allows us to test for a false value:

		if (!courseInSession) {
			System.out.println("Course is not in session.");
		}
//		 ... or it can flip a true value to false, and a false value to true:

		courseInSession = !courseInSession;
//		!= is the "not equal to" operator:
		System.out.println(courseInSession);
		if (lectureCount != 150) {
			System.out.println("The lecture count is something other than 150");
		}
//		The == operator checks for equality:

		if (lectureCount == 150) {
			System.out.println("The lecture count is 150");
		}
//		And the rest check to see if a value is less than (<), less than or equal to (<=), greater than (>), greater than or equal to (>=):

		if (lectureCount < 10) {
			System.out.println("Lecture count is less than 10");
		} else if (lectureCount >= 20 && lectureCount <= 30) {
			System.out.println("Lecture count is between 20 and 30 [inclusive]");
		} else if (lectureCount > 100) {
			System.out.println("Lecture count is 101 or greater.");
		}

//		Arithmetic Operators
//		+ is add (or concatenation when used with a String), - is subtract, * is multiply, and / is divide. 
		// The use of those operators should be obvious. The one arithmetic operator
		// that deserves further discussion is the modulo or remainder operator: %. This
		// operator returns the remainder of a division operation. For example:
//
//		10 % 2 == 0 (10 / 2 == 5 with a remainder of 0)
//
//		10 % 4 == 2 (10 / 4 == 2 with a remainder of 2)
//
//		etc.

//		Assignment Operators
//		= is an assignment operator.  It can be used on its own (int x = 30;) or it can be used with arithmetic operations as well:
		int x = 0;

		x = x + 5;

//		is the same thing as:

		x += 5;

//		Other examples:

		x -= 5; // Same as x = x - 5;

		x *= 5; // Same as x = x * 5;

		x /= 5; // Same as x = x / 5;

		x %= 5; // Same as x = x % 5;
		System.out.println(x);

		System.out.println(2 + 3 + "" + 4 + 5);// when a string is added to the mix it then concatenates what's in the
												// print statement after the string was introduced
	}
}
