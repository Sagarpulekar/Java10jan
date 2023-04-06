package com.arraylist;

import java.util.ArrayList;
import java.util.List;

public class NonGenricArrayListDemo {

	public static void main(String[] args) {

      List list1= new ArrayList ();
      
      list1.add("Shuruti");
      list1.add(67); // autobo
      list1.add(78.5f);
      list1.add('c');
      
      
     for(int i=0;i<list1.size();i++)
     {
    	 System.out.println(list1.get(i));
    	 int data= (int)list1.get(i)+5; // casting object to int
    	 list1.set(i, data);
    	 
     }
      

	}

}
