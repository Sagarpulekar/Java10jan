package com.example;

public class MethodDemo2 {
	
	static int sumOdd(int n)
	{
		int sum;
		sum=0;
		for(int i=0; i<=n;i++)
		{
			if(i%2!=0)
				sum+=i;
		}
		
		return sum;
	}
	
	static int sumEven(int n)
	{
		int sum;
		sum=0;
		for(int i=0; i<=n;i++)
		{
			if(i%2==0)
				sum+=i;
		}
		
		return sum;
	}

	public static void main(String[] args) {

     System.out.println(sumOdd(10));
     System.out.println(sumEven(20));
     
     int s= sumOdd(90);

	}

}
