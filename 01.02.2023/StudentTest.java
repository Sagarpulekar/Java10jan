package com.demo;

public class StudentTest {

	public static void main(String[] args) {

     Student s1= new Student(1,"Bhushan");
     System.out.println(s1);
     
     Student s2= new Student(2,"Priya");
     System.out.println(s2);
     
    // s1.schoolName="St Mary";
    // s1.setSchoolName("St Mary");
     
     Student.setSchoolName("St Mary");
     
     System.out.println(s1);
     System.out.println(s2);

     
     System.out.println("----------------------------------------");
     Student s3= new Student();
     System.out.println(s3);
	}

}
