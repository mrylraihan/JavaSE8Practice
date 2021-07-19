package com.newStuff.Practice;

public class BraxProblem {

	public int multArray(int[] a) {
		 int counter = 0;
		    for(int i = 0; i < a.length; i++){
		        if(a[i] == 0)return 0;
		        if(a[i] < 0)counter++;
		    }
		    if(counter%2 == 1)return -1;
		    else{
		        return 1;
		    }
	}

	public static void main(String[] args) {
		int[] numlist = {1,2,3,4,5};
		BraxProblem bp = new BraxProblem();
		System.out.println(bp.multArray(numlist));
	}

}
