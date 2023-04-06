package com.example;

public class FactorialNumber {
	
	public  long calculateFactorial(int n)
	{
		long fact=1;
		for(int i=2;i<=n;i++)
		{
			fact*=i;
		}
		
		return fact;
	}

	public static void main(String[] args) {

     /* System.out.println(calculateFactorial(9));
      System.out.println(calculateFactorial(7));
      
      long facto= calculateFactorial(8);
      System.out.println(facto);*/
		
		FactorialNumber fact1= new FactorialNumber();
		
		System.out.println(fact1.calculateFactorial(9));
		

	}

}
