package com.set;

import java.util.HashSet;
import java.util.Iterator;

public class StudentHashSetDemo {

	public static void main(String[] args) {
		
		HashSet<Student> hs= new HashSet<>();
		
		hs.add(new Student(101,"Vivek",89f));
		hs.add(new Student(102,"Suyog",86f));
		hs.add(new Student(103,"Vaishnavi",78f));
		hs.add(new Student(103,"Vaishnavi",78f)); 
		
		// override equals and hashcode
		
		for(Student s:hs)
		{
			System.out.println(s);
		}
		
		System.out.println("===========================================");
		
		Iterator<Student> itr= hs.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		

  
	}

}
