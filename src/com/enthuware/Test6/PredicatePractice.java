package com.enthuware.Test6;

import java.util.*;
import java.util.function.Predicate;
class Data{
    int value;
    public Data(int x){ this.value = x; }
    public String toString(){ return ""+value; }
}



public class PredicatePractice{
    
   public static void filterData(ArrayList<Data> dataList, Predicate<Data>p){
      Iterator<Data> i = dataList.iterator();
      while(i.hasNext()){
           if(p.test(i.next())){
                i.remove();
           }
       }
   }

  public static void main(String[] args) {
        ArrayList<Data> al = new ArrayList<Data>();
        Data d = new Data(1); al.add(d);
        d = new Data(2); al.add(d);
        d = new Data(0); al.add(d);

        filterData(al, x -> x.value==0);  //1

        System.out.println(al);
    }
}

