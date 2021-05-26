package com.intertech.lambdaPractice2;

public class Main{
	public void printing(AddingInterface ad, int y, int x) {
		System.out.println(ad.addingStuff(y, x));
		
	}
	
	public static void main(String[] args) {
		
		Main m = new Main();
		
		OnePerson person = new OnePerson("Wayel", 29);
		
		GreetInterface greet = ()->System.out.println("hey bro");
		greet.Greetings();
		
//		greet.Bye(); how to call the default method in this interface 
//		GreetInterface.ByeAgain(); how to call the static method in this interface
	
		
		NameInterface aboutMe = (w)->System.out.println("hey im "+w.name + " and im "+w.age);
		
		aboutMe.tellAboutme(person);
		
		
		AddingInterface adding = (a,b)-> a+b;
		
		System.out.println(adding.addingStuff(3, 4));
		
		m.printing(adding, 2, 2);
		
		
//		AgeInterface whatTheAge = (OnePerson y) -> System.out.println(y.age);
		
		AgeInterface whatTheAge = y -> System.out.println(y.age);
		
		whatTheAge.AgeOfPerson(person);
		
		
		
//		__________________________Anomous Inner Class
		subtractInterface subTract = new subtractInterface() {
			
			@Override
			public void subtractStuff(int a, int b) {
				System.out.println(a-b);
				
			}
		};
		
		subTract.subtractStuff(3, 1);
		
//		_____________________________
		
		
	
		
	}

}
