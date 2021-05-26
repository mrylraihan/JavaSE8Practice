package com.intertech.abstract1;

public class Main extends AnotherClass{
public static void main(String[] args) {
	
		Circle c = new Circle();
		c.r = 10.0;
		Rectangle r = new Rectangle();
		r.h = 5.0;
		r.w = 7.0;
		Triangle t = new Triangle();
		t.b = 3.0;
		t.h = 7.0;
		Square s = new Square();
		s.h = 4.0;
		s.w = 4.0;
		
		double diff = areaDifference(r,s);
		System.out.println(diff);
		
		Drawable d1 = new Cat();
		Drawable d2 = new Circle();
		d1.sayHi();
		d2.sayHi();
		((Circle)d2).area();
		print(d1);
		print(d2);
		
		
		Drawable.sayBye();
		r.testBehavior();
	}
}
