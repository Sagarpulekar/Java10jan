package com.linkedhashMap;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapDemo2 {

	public static void main(String[] args) {

      LinkedHashMap<String, Double> lmap= new LinkedHashMap<>(10,0.75f,true);
      lmap.put("Rupali", 78.5);
      lmap.put("Priya", 73.5);
      lmap.put("Vivek", 85.4);
      lmap.put("Uday", 83.5);
      
      for(Map.Entry<String, Double> en: lmap.entrySet())
      {
    	  System.out.println(en.getKey()+"  "+en.getValue());
      }
      
         
     
     System.out.println("======================================");
     double m= lmap.get("Vivek");
     m= lmap.get("Priya");
     
     for(Map.Entry<String, Double> en: lmap.entrySet())
     {
   	  System.out.println(en.getKey()+"  "+en.getValue());
     }
     
     
     
     
      

	}

}
