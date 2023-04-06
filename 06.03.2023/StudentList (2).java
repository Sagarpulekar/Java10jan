package com.customArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class StudentList {

	public static void main(String[] args) {

     ArrayList<Student> slist = new ArrayList<>();
     slist.add(new Student(101,"Suyog",89f));
     slist.add(new Student(102,"Vivek",78f));
     slist.add(new Student(103,"Sagar",89f));
     slist.add(new Student(104,"Aditya",67f));
     slist.add(new Student(105,"Mamta",57f));
     
     for(Student s:slist)
     {
    	 System.out.println(s);
     }
     
     Collections.sort(slist);
     //Collections.reverse(slist);
     
     
     System.out.println("================================================");
     
     for(Student s:slist)
     {
    	 System.out.println(s);
     }
     
     Collections.sort(slist,Collections.reverseOrder());
     
    System.out.println("================================================");
     
     for(Student s:slist)
     {
    	 System.out.println(s);
     }
     

	}

}
