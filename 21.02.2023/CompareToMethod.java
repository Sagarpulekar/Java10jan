package com.demo;

public class CompareToMethod {

	public static void main(String[] args) {

       String s1="Sagar";// 65-90
       String s2="Suyog"; // lowercase 97 -122
       System.out.println(s1.compareTo(s2));
       
       String s3="Java";
       String s4="java";
       
       System.out.println(s3.compareTo(s4));
       
       if(s3.compareTo(s4)==0)
       {
    	   System.out.println("String are equal");
       }
       else if(s3.compareTo(s4)>1)
       {
    	   System.out.println(s3+" is greater than "+s4);
    	   
    	   
    	   
       }
       else
       {
    	   System.out.println(s3+" is smaller than "+s4);
       }

       System.out.println(s3.compareToIgnoreCase(s4));
       
	}

}
