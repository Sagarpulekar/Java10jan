package com.demo;

public class CountCharacters {
	
	public static int countCharacters(String s)
	{
		int ct=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
				ct++;
		}
				
		return ct;
	}

	public static void main(String[] args) {

     String s1= "Welcome to java";
     int count= countCharacters(s1);
     System.out.println(s1);
     System.out.println("Number of characters:"+count);

	}

}
