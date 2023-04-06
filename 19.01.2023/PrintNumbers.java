package com.loops;

import java.util.Scanner;

public class PrintNumbers {

	public static void main(String[] args) {
		
		int sumOdd, sumEven;
		sumOdd=sumEven=0;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the size:");
		int n= sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			if(i%2==0) // even number
			 
				sumEven+=i; // adding the numbers to sum of even
			 
			else
				sumOdd+=i; // adding the numbers to sum of odd
		}
		
		System.out.println("Sum of even numbers:"+sumEven);
		System.out.println("Sum of odd numbers :"+sumOdd);
		
       sc.close();
	}

}
