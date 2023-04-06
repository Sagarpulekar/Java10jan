package com.arraylistlogical;

import java.util.ArrayList;

public class CapacityArrayList {

	public static void main(String[] args) {

     ArrayList<Integer> list1= new ArrayList<>(20);
    
     ArrayList<Integer> list2= new ArrayList<>();
     list2.ensureCapacity(20);
     
     list2.add(90);
     list2.add(56);
     
     list2.trimToSize();// capacity:2
     
     
  

	}

}
