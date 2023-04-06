package com.treemap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortByValuesTreeMap {
	
	public static void sortByPrice(TreeMap<Customer, Order> tm)
	{
		ArrayList<Order> al= new ArrayList<>(tm.values());
		Collections.sort(al,new PriceComparator());
		
		LinkedHashMap<Customer, Order> lhm= new LinkedHashMap<>();
		
		Iterator<Order> itr=al.iterator();
		
		while(itr.hasNext())
		{
			Customer c=null;
			Order o= itr.next();
			
			for(Map.Entry<Customer, Order> en: tm.entrySet())
			{
				if(o.equals(en.getValue()))
				{
					c= en.getKey();
					if(!lhm.containsKey(c))
					{
						lhm.put(c, o);
					}
				}
			}
			
		}
		

	     for(Map.Entry<Customer, Order> en: lhm.entrySet())
	    {
		  System.out.println(en.getKey());
		  System.out.println(en.getValue());
	     }
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		TreeMap<Customer, Order> cmap= new TreeMap<>();
	    cmap.put(new Customer(101,"Shuruti",786544), new Order(5,"PenDrive",780f));
	    cmap.put(new Customer(100,"Sagar",786541), new Order(2,"Laptop",78000f));
	    cmap.put(new Customer(99,"Priya",796041), new Order(1,"Earphones",1200f));
	    

	     for(Map.Entry<Customer, Order> en: cmap.entrySet())
	    {
		  System.out.println(en.getKey());
		  System.out.println(en.getValue());
	     }
	     
	   System.out.println("//////////////////////////////////////////////");  
	   sortByPrice(cmap);
		
	}
	
	
	

}
