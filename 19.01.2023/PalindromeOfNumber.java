package com.loops;

import java.util.Scanner;

public class PalindromeOfNumber {

	public static void main(String[] args) {

      Scanner sc= new Scanner(System.in);
      System.out.println("Enter a number");
      int num= sc.nextInt();
      int originalNum=num;
      int reverseNum=0;
      int rem;
      while(num!=0)
      {
    	 rem= num%10;
    	 reverseNum= (reverseNum*10)+rem;
    	// System.out.println(reverseNum);
    	 num/=10; // num=num/10;
      }

      if(originalNum==reverseNum)
      {
    	  System.out.println("Number is palindrome");
      }
      else
      {
    	  System.out.println("Number is not palindrome");
      }
      sc.close();
      
	}

}
