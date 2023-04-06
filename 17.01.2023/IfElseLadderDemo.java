// WAP to calculate area of the circle
  import java.util.Scanner;
  
  class IfElseLadderDemo
  {
	  public static void main(String args[])
	  {
		  Scanner sc= new Scanner(System.in);
		 System.out.println("Enter your percentage:");
		 float per= sc.nextFloat();
		 char grade;
		 if(per>=90)
			 grade='A';
		 else if(per>=75)
			  grade='B';
              else if(per>=60)
                    grade='C';
                   else if(per>=40)
                        grade='D';
                        else 
                         grade='F';


					 
     if(grade=='F')
     {
		 System.out.println("Failed.........");
	 }		 
		 
	else
	{
         System.out.println("Pass with grade:"+grade);    
	}	 
		  
	  }
	  
  
  }
  
 