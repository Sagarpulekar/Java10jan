package com.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorList {

	public static void main(String[] args) {

		 ArrayList<String> stud= new ArrayList<>();
	      
	      stud.add("Bhushan");
	      stud.add("Chinmay");
	      stud.add("Shuruti"); 
	      stud.add("Priya");
	      stud.add("Vaishnavi");
	      stud.add("Priya");// duplicate allowed
	      stud.add("Adinath"); 
	      
	      Iterator<String> itr= stud.iterator();
	      
	      /*while(itr.hasNext()) // cursor position before thr first object
	      {
	    	  System.out.println(itr.next());
	      }
	      */
	      
	      // removal Vaishnavi
	      while(itr.hasNext()) // cursor position before thr first object
	      {
	    	  String name=itr.next();
	    	  if(name.equals("Vaishnavi"))
	    	  {
	    		 // stud.remove("Vaishnavi"); // concurrent modification exception
	    		  itr.remove();
	    		  System.out.println("Name removed: "+name);
	    	  }
	    	    	  
	    	
	      }
	      
	     System.out.println(stud); 
	      

	}

}
