package com.demo;

import java.util.Scanner;

public class EnhancedSwitch2 {
	
	public static void main(String args[]) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the course:");
		String course=sc.next();
		
		switch(course) {
		
		case "Java","C","C++","Python" -> System.out.println("Programming Languages");
		                            
		case "Sql","Oracle","Mongodb"-> System.out.println("Database Courses");
		                             
		case "cloud","aws","bigdata"->System.out.println("Other courses");                               
		                           
		                             
		                
		default-> System.out.println("No course available");
		}
		
		sc.close();
	}

}
