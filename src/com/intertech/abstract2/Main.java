package com.intertech.abstract2;

public class Main extends speedTest {
	public static void main(String[] args) {
		Tesla model3 = new Tesla(200.0,"Model 3");
		Bmw m3 = new Bmw(190.0,"M 3");
		
		
	
		


		double speedDifferneces = speedDifference(model3, m3);
		System.out.println(speedDifferneces);
		
		
		System.out.println("----------------------->");
		Tesla modelY = new Tesla(220.00, "Model Y");
		startingBuild(modelY);
		startingBuild(m3);
		startingBuild(model3);
		
		
	}

	

}
