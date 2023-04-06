package com.Student;

import java.util.Arrays;
import java.util.Scanner;

public class StudentTest2 {
	
	static Scanner sc= new Scanner(System.in);
	
	public static void enterStudentDetails(Student s)
	{
		System.out.println("Enter id:");
		s.setId(sc.nextInt());
		
		System.out.println("Enter name:");
		s.setName(sc.next());
		
		System.out.println("Enter marks:");
		s.setMarks(sc.nextFloat());
		
		
	}

	public static void main(String[] args) {

      Student stud[]= new Student[3];
            
       for(int i=0;i<stud.length;i++)
       {
           stud[i]= new Student();
           //System.out.println(st);
           enterStudentDetails(stud[i]);
           
       }
       
       System.out.println(Arrays.toString(stud)); // print all the students

       for(Student st:stud)
       {
    	   System.out.println(st);
       }
      

	}

}
