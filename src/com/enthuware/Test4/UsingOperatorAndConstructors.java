package com.enthuware.Test4;

public class UsingOperatorAndConstructors {
	public static void main(String[] args) {
		int k = 1;
		int[] a = {1};
		k += (k=4) *(k+2);//first k= 4 gets assigned so then k is 4 then we do k + 2 = 6 then times that by 4 =24 then we add that to the original 1 = 25
		a[0] += (a[0] = 4)*(a[0] + 2);// first a[0] get assigned 4 then we do a[0] plus 2 = 6 then we times it by 4 and add it to the original 1 = 25
		System.out.println(k+" , "+ a[0]);
	}

}
