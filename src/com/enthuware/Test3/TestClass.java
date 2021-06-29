package com.enthuware.Test3;

class Square {
    private double side = 0;
    String color;
    public Square(double length){
        this.side = length;
    }
    public double getSide() {  return side;    }

    public void setSide(double side) {  this.side = side;   }
    
}

public class TestClass {
    public static void main(String[] args) throws Exception {
    	float s = 0*0123;
        Square mysq = new Square(10);
        mysq.color = "red";
        
        mysq.setSide(20);
        System.out.println(mysq.getSide());
        System.out.println(s);
        //set mysq's side to 20
    }
}