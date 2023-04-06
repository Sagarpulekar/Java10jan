// WAP to calculate area of the circle
  import java.util.Scanner;
  
  class IfElseDemo
  {
	  public static void main(String args[])
	  {
		  Scanner sc= new Scanner(System.in);
		 System.out.println("Enter your percentage:");
		 float per= sc.nextFloat();
		 
		 if(per>=65)
		 {
			 System.out.println("Eligible in college.......");
			 if(per>=85)
			 {
				 System.out.println("You can choose Science and Commerce both.......");
			 }
			 else
			 {
				System.out.println("You can choose only commerce......"); 
			 }
		 }
		 else
		 {
			 System.out.println("Not Eligible in college.......");
		 }
		 
		
		  
	  }
	  
  
  }
  
 