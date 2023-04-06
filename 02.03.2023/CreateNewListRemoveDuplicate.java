package com.arraylistlogical;

import java.util.ArrayList;

public class CreateNewListRemoveDuplicate {
	
	public static void createList(ArrayList<String> list)
	{
		ArrayList<String> ulist= new ArrayList<>();
		
		for(String s:list)
		{
			if(!ulist.contains(s))
			{
				ulist.add(s);
			}
			
		}
		
		System.out.println(ulist);
		
	}

	public static void main(String[] args) {
		
		ArrayList<String> list1= new ArrayList<>();
		list1.add("A");
		list1.add("C");
		list1.add("A");
		list1.add("X");
		list1.add("A");
		list1.add("X");
		
		createList(list1);

	}

}
