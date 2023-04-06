package com.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ConversionArrayListToArray {

	public static void main(String[] args) {

     String subjects[]= {"English","Maths","Computers","Science"};
    // System.out.println(subjects);
     
     // 1st way
     
    // asList
     
     List<String> sub= Arrays.asList(subjects);
     System.out.println(sub);
     
     // 2nd way
     
     List<String> sub1= new ArrayList<>(Arrays.asList(subjects));
     System.out.println(sub1);
     
     // 3rd way
     //Collections.addAll: faster way
     
     ArrayList<String> sub3= new ArrayList<>();
     Collections.addAll(sub3, subjects);
     
     System.out.println(sub3);
     
     Collections.addAll(sub3, "Hindi","SST");
     
     System.out.println(sub3);
     
     
     ///////////////////////////////////////////////////////////////////////////
     
     //converting arraylist into array
     
     Object[] subArray= sub3.toArray();
     
     System.out.println(Arrays.toString(subArray));
     
     for(int i=0;i<subArray.length;i++)
     {
    	 subArray[i]= ((String) subArray[i]).concat(" Subject");
     }
     
    
     // array to be type safe
     
     String[] subArray1= new String[sub3.size()];
     sub3.toArray(subArray1);
     
     System.out.println(Arrays.toString(subArray1));
     
     for(int i=0;i<subArray1.length;i++)
     {
    	 subArray1[i]= subArray1[i].concat(" Subject");
     }
     
     
     
	}

}
