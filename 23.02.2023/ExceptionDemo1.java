package com.exceptiondemo;

public class ExceptionDemo1 {

	public static void main(String[] args) {

    /* float a=90;
      float b=0;
      
      float c= a/b;
      System.out.println(c); // infinity*/
      
      int num1=89;
      int num2= 0;
      try
      {
      int result=num1/num2;
      System.out.println("Result:"+result);
      }
      catch(Exception e)
      {
    	 // System.out.println("cannot divide by zero");
    	  System.out.println("Exception occured :"+e.getMessage());
      }
      
      System.out.println("Hello java");
      

	}

}
