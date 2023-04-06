package com.trenary;

public class TrenaryExample {

	public static void main(String args[])
	{
		int a=90;
		int b=78;
		int greater;
		/*if(a>b)
			greater=a;
		else
			greater=b;
		
		System.out.println(greater +"  is greater");*/
		
		/*greater=(a>b)?a:b;
		System.out.println(greater +"  is greater");*/
		System.out.println(((a<b)?a:b)+" is smaller");
		
		// nested trenary
		
		//greater of three numbers
		int c=45;
		
		if((a>b)&&(a>c))
		{
			System.out.println("a is greater");
							
		}
		else if(b>c)
			 System.out.println("b is greater");
		      
		    else
		    	System.out.println("c is greater");
		
		
	    greater=(a>b)?(a>c?a:c):(b>c?b:c); 
			
		
		
	}
	
}

// trenary: operands: 3

