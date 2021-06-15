package com.intertech.CollectionsExtras;

import java.util.ArrayList;
import java.util.List;

public class AutoBoxingPointer2 {
	public static void main(String[] args) {
		List<Integer> primes = new ArrayList<Integer>();
		primes.add(Integer.valueOf(1));
		primes.add(Integer.valueOf(2));
		primes.add(Integer.valueOf(3));
		primes.add(Integer.valueOf(4));
		primes.add(Integer.valueOf(5));
		primes.add(6);//with Autoboxing
		int j = primes.get(2);//with unboxing
		int x = primes.get(1).intValue();//with Generics 
		int y = ((Integer)primes.get(0)).intValue(); //without unboxing and Generics
		System.out.println(x);
		System.out.println(y);
		
		List<Character> letters = new ArrayList<Character>();
		letters.add(Character.valueOf('a'));//without Autoboxing
		letters.add(Character.valueOf('b'));
		letters.add(Character.valueOf('c'));
		letters.add(Character.valueOf('d'));
		letters.add(Character.valueOf('e'));
		char a = letters.get(0).charValue();
		char b = letters.get(1).charValue();
		System.out.println(a);
		System.out.println(b);
		
		//Another example
		
		Integer w = 5;//Autoboxing Automatically wrapping the int 5 with its wrapper class, no casting nessary
		System.out.println(w);
		int z = w;//unboxing Automatically converting the Integer to an int, with no casting
		System.out.println(z);
		
		
		List<Integer> primes1 = new ArrayList<Integer>();
		primes1.add(1);//with Autoboxing
		primes1.add(2);//with Autoboxing
		primes1.add(3);//with Autoboxing
		primes1.add(4);//with Autoboxing
		primes1.add(5);//with Autoboxing
		primes1.add(6);//with Autoboxing
		int g = primes.get(2);//with unboxing
		int e = primes.get(1).intValue();//with Generics 
		int r = ((Integer)primes.get(0)).intValue(); //without Generics
		System.out.println(g);
		System.out.println(e);
		System.out.println(r);
	}
}
