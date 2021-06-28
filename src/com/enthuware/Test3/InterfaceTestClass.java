package com.enthuware.Test3;

import java.time.LocalDate;

interface Movable {
	int location = 24;
	String name= "Garrett";
	  void move(int by);
	  public void moveBack(int by);
}

 class Donkey implements Movable{
    int location = 200;
    public void move(int by) {
        location = location+by;
    }
    public void moveBack(int by) {
        location = location-by;
    }
}
 
public class InterfaceTestClass {
	    public static void main(String[] args) {
	        Movable m = new Donkey();
	        m.move(10);
	        m.moveBack(20);
	        System.out.println(m.location);
	    }
	}