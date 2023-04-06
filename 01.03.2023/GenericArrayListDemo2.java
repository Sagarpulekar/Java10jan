package com.arraylist;

import java.util.ArrayList;
import java.util.List;

public class GenericArrayListDemo2 {

	public static void main(String[] args) {

      List<Integer> list1= new ArrayList<Integer>();
      
      list1.add(89);
      list1.add(67); // autobo
      list1.add(55);
      list1.add(78);
      
      
     for(int i=0;i<list1.size();i++)
     {    	
    	 int data= list1.get(i)+5; // casting object to int
    	 list1.set(i, data);
    	
    	 
     }
     
     for(Integer l:list1)
     {
    	 System.out.println(l);
    	 
     }
      

	}

}
