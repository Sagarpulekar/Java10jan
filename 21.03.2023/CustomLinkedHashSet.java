package com.set;


import java.util.Iterator;
import java.util.LinkedHashSet;

public class CustomLinkedHashSet {

	public static void main(String[] args) {

     LinkedHashSet<Student> hs= new LinkedHashSet<>();
		
		hs.add(new Student(101,"Vivek",89f));
		hs.add(new Student(102,"Suyog",86f));
		hs.add(new Student(103,"Vaishnavi",78f));
		hs.add(new Student(103,"Vaishnavi",78f)); 
		
		Iterator<Student> itr= hs.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
