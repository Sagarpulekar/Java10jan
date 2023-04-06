package com.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodsArrayList2 {

	public static void main(String[] args) {

      ArrayList<String> stud= new ArrayList<>();
      
      stud.add("Bhushan");
      stud.add("Chinmay");
      stud.add(null); // null allowed
      stud.add("Priya");
      stud.add("Vaishnavi");
      stud.add("Priya");// duplicate allowed
      stud.add(null); 
      
      System.out.println(stud);
     
      System.out.println("==========Sublist===============");
      
     List<String> list1 = stud.subList(1, 3);
     System.out.println(list1);
      
     
     System.out.println("Contains Priya:"+stud.contains("Priya"));
     
     System.out.println("-------------After removing all Priya---------");
     
     for(int i=0;i<stud.size();i++)
     {
    	 if(stud.get(i)==("Priya"))
    	 {
    		stud.remove(i); 
    	 }
     }
     
     // collection
    // stud.removeAll(Collections.singleton("Priya"));
      
     
   
     System.out.println(stud);
     

   
     
      
	}

}
