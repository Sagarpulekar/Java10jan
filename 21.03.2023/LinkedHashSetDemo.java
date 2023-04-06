package com.set;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) 
	{

    LinkedHashSet<String> colours= new LinkedHashSet<>();
	
	colours.add("Blue");
	colours.add("Purple");
	colours.add("Black");
	colours.add("Blue");
	colours.add(null);
	
	for(String s:colours)
	{
		System.out.println(s);
	}



	}

}
