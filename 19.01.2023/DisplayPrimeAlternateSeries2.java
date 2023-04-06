package com.loops;

import java.util.Scanner;

public class DisplayPrimeAlternateSeries2 {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number:");
		int n= sc.nextInt();
		int count=1;
		int num=2;

		while(count<=2*n) // skipping counter at alternate values
		{
           boolean flag=true;
		
			  for(int i=2;i<=num/2;i++)
			   {
				if(num%i==0)
				{
					//System.out.println(num+" is not a prime number");
					flag=false;
					break; // to come out of for loop
				}
			  }
     		// number is prime
	    	if(flag) // flag==true
		  {
	    	count++;	
	    	if(count%2==0)// tr==true	
			{
	    	System.out.println(num);
					
			}
		  }
	    	
		num++;
		}	

	}

}
