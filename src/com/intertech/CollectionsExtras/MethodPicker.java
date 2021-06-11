package com.intertech.CollectionsExtras;

public class MethodPicker {
	 // Method A
    public void pickMe(int x) {
        System.out.println ("int");
    }
 
    // Method B
    public void pickMe(long x) {
        System.out.println ("long");
    }
 
    // Method C
    public void pickMe(Integer x) {
        System.out.println ("Integer");
    }
 
    // Method D
    public void pickMe(int... x) {
        System.out.println ("int...");
    }
 
    // Method E 
    public void pickMe(long... x) {
        System.out.println ("long...");
    }
    
    public static void main(String[] args) {
        MethodPicker mp = new MethodPicker();
        int x = 5;
        mp.pickMe(x); 
    }  
}
