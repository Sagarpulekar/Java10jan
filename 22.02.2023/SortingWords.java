package com.words;

import java.util.Arrays;

public class SortingWords {
	
	public static void sortArray(String []str)
	{
		String temp;
		for(int i=0;i<str.length;i++)
		{
			for(int j=i+1;j<str.length;j++)
			{
				//str[i]>str[j]
				if((str[i].compareTo(str[j]))>1)
				{
					temp=str[i];
					str[i]=str[j];
					str[j]=temp;
				}
				
			}
		}
		System.out.println(Arrays.toString(str));
	}

	public static void main(String[] args) {
		
		String lang[]= {"C","Python","Go","Java","Asp.net","Angular"};

		sortArray(lang);

	}

}
