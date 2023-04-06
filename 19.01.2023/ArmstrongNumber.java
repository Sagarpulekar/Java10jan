package com.loops;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		

	      Scanner sc= new Scanner(System.in);
	      System.out.println("Enter a number");
	      int num= sc.nextInt();
	      int originalNum=num;
	      int armNumber=0;
	      int digits=0;
	      int rem;
	      // to calculate the digits
	      while(num!=0)
	      {	    	
	    	  num/=10; 
	    	  digits++;
	    	  System.out.println("num:"+num);
	      }
    
	      System.out.println("Digits are :"+digits);
	      System.out.println("num:"+num);
	      
	      num=originalNum;
	      System.out.println("num:"+num);
	      
	      while(num!=0)
	      {	    	
	    	  rem=num%10; 
	    	  num/=10; 
	    	  
	    	  // to calculate power of any number
	    	  int n=1;
	    	  for(int i=1;i<=digits;i++)
	    	  {
	    		n=n*rem;
	    		System.out.println("Pow number:"+n);
	    	  }
	    	  
	    	  armNumber+=n;
	    	  System.out.println("Arm Number:"+armNumber);
	      }
	      
	      if(originalNum==armNumber)
	      {
	    	  System.out.println("Number is armstrong number");
	      }
	      else
	      {
	    	  System.out.println("Number is not armstrong number");
	      }
	      
	      
	     
	      sc.close();
	      

	}

}
