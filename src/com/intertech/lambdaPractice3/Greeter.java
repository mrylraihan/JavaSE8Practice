package com.intertech.lambdaPractice3;

public class Greeter {
	public void greet(Greeting greeting) {
		greeting.perform();
	}
	public void byes(ByeBye byebye) {
		byebye.GoodByes();
	}
	public static void main(String[] args) {
		
		Greeter greeter = new Greeter();
		
		Greeting hellowWorldGreeting = new HelloWorldGreeting();	
		
		Greeting lambdaGreet = () -> System.out.println("Hello World");
		
		OpenComputer computer = ()->System.out.println("Turn on Computer");
		
		
		
		
		Greeting innerClass = new Greeting() {
			
			@Override
			public void perform() {
				System.out.println("Hello World");
				
			}
		};
		
		innerClass.perform();
		lambdaGreet.perform();
		
		greeter.greet(lambdaGreet);
		greeter.greet(() -> System.out.println("Hello World"));
		greeter.greet(hellowWorldGreeting);
		greeter.greet(innerClass);
		
		greeter.byes(()-> System.out.println("Bye bye"));
		
		computer.turnOn();
		
		
		
	}

}
