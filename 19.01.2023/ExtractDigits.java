package com.loops;

import java.util.Scanner;

public class ExtractDigits {

	public static void main(String[] args) {
		
      Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int num= sc.nextInt();
		
		System.out.println("Digits are:");
		
		while(num!=0)
		{
			System.out.println(num%10);
			num/=10;
			
		}
		
		sc.close();
	}

}
