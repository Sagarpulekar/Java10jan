package com.loops;

import java.util.Scanner;

public class PrintTable {

	public static void main(String[] args) {

      Scanner sc= new Scanner(System.in);
      
      System.out.println("Enter a number:");
      int num=sc.nextInt();
      
      System.out.println("-----------------------------");
      System.out.println("Table of "+num);
      System.out.println("-----------------------------");
      
      for(int i=1;i<=20;i++)
      {
    	  System.out.println(num+"X"+i+"="+(num*i));
      }
      
	}

}
