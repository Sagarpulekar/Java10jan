package com.set;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {

      HashSet<String> hs= new HashSet<>();
      hs.add("Java");
      hs.add("Python");
      hs.add("Angular");
      hs.add(null);
      hs.add("Java");
      hs.add(null);// No error
      
      System.out.println(hs);
      
      HashSet<String> hs2= new HashSet<>();
      hs2.add("Java");
      hs2.add("Python");
      hs2.add("Spring");
      hs2.add("Html");
     
      System.out.println(hs2);
      
      // Mathematical operation of set
      
      hs.addAll(hs2); // Union
      System.out.println(hs);
      /*
      hs.removeAll(hs2);// difference
      System.out.println(hs);
      */
      
      hs.retainAll(hs2);// intersection
      System.out.println(hs);
      
      
      

	}

}
