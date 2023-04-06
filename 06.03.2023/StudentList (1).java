package com.comparatordem;

import java.util.ArrayList;
import java.util.Collections;

public class StudentList {

	public static void main(String[] args) {

     ArrayList<Student> slist = new ArrayList<>();
     slist.add(new Student(101,"Suyog",23,89f));
     slist.add(new Student(102,"Vivek",26,78f));
     slist.add(new Student(103,"Sagar",22,89f));
     slist.add(new Student(104,"Aditya",27,67f));
     slist.add(new Student(105,"Mamta",26,57f));
     
     for(Student s:slist)
     {
    	 System.out.println(s);
     }
    
     Collections.sort(slist, new NameComparator());
     
     System.out.println("=========================================");
     for(Student s:slist)
     {
    	 System.out.println(s);
     }
     
}
}
