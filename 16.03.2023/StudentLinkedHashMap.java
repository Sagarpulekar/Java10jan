package com.linkedhashMap;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class StudentLinkedHashMap {

	public static void main(String[] args) {
		
		Student s1=new Student(12,"Shuruti",78.5f);
		Student s2=new Student(23,"Mehul",67.5f);
		Student s3=new Student(11,"Karan",89.5f);
		Student s4=new Student(56,"Biad",89.4f);
		Student s5=new Student(90,"Mehul",90.4f);
		Student s6=new Student(91,"Prem",78.6f);
		
		LinkedHashMap<Student, String> lmap= new LinkedHashMap<>(30,0.75f,true);
		
		lmap.put(s1, "CSE");
		lmap.put(s2, "IT");
		lmap.put(s3, "IT");
		lmap.put(s4, "CSE");
		lmap.put(s5, "IT");
		lmap.put(s6, "IT");
		
		Set<Entry<Student,String>> entrySet= lmap.entrySet();
		Iterator<Entry<Student,String>> itr= entrySet.iterator();
		
		while(itr.hasNext())
		{
			Entry<Student,String> en= itr.next();
			System.out.println(en.getKey());
			System.out.println(en.getValue());
		}
		
		System.out.println("===============================================");
		
		String course= lmap.get(s3);
		System.out.println(s3);
		System.out.println(course);
		
		System.out.println("===============================================");
		
		Set<Entry<Student,String>> entry= lmap.entrySet();
		Iterator<Entry<Student,String>> itr1= entry.iterator();
		
		while(itr1.hasNext())
		{
			Entry<Student,String> en= itr1.next();
			System.out.println(en.getKey());
			System.out.println(en.getValue());
		}
		



	}

}
