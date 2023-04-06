package com.demo;

import java.util.Scanner;

public class NestedSwitch {
	
	public static void main(String args[]) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the course:");
		String course=sc.next();
		System.out.println("Enter the subject:");
		String subject=sc.next();
		
		switch(course) {
		
		case "Computer":switch(subject) {
		                 case "OS": System.out.println("Opearting system");
		                            break;
		                 case "Net":System.out.println("Networking System");
                                            break;  
		                 case "SE":System.out.println("Software Engineering");
                                    break;    
                         default: System.out.println("No subject in computer stream");
                                                  		
	                 	}
		                break;
		case "Electrical":switch(subject) {
        
                          case "Cr":System.out.println("Circuit System");
                                     break;  
                          case "DE":System.out.println("Digital Eletronics");
                                      break;    
                           default: System.out.println("No subject in electronics stream");
	                    	}
		                  break;
		                
		default: System.out.println("No course available");
		}
		
		sc.close();
	}

}
