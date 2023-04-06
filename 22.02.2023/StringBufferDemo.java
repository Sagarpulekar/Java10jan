package com.stringbuffer;

public class StringBufferDemo {

	public static void main(String args[])
	{
		StringBuffer sb= new StringBuffer("Java");
		/*String s1= new String("Java");
		s1.concat("Program");*/
		System.out.println(sb.capacity());
		
		StringBuffer sb1= new StringBuffer(5);
		System.out.println(sb1.capacity());
		
		sb1.ensureCapacity(15);
		System.out.println(sb1.capacity());
		sb1.append("Java is a program language ");
		
		System.out.println(sb1.capacity());//16   (old*2)+2
		
		sb.append(" Programs");
		System.out.println(sb);
		
		sb.insert(4, " has");
		System.out.println(sb);
		
		sb.replace(5, 8,"gives");
		System.out.println(sb);
		
		sb.delete(5, 8);
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
	}
	
}
