package com.cart;

public class CartTest {

	public static void main(String[] args) {

       Item i1= new Item("I1","Biscuits",15f);
       Item i2= new Item("I2","Juice",75f);
       Item i3= new Item("I3","Nachos",67f);
       Item i4= new Item("I4","Sugar",36f);
       Item i5= new Item("I5","Chocolates",25f);
       
       ShoppingCart c1= new ShoppingCart(101,"Shuruti");
       c1.setItem(i1);
       c1.setItem(i3);
      
       
       System.out.println(c1);
     /*  
       totalBill=0.0;
       ShoppingCart c2= new ShoppingCart(102,"Vivek");
       c2.setItem(i2);
       totalBill+=i2.getUnitPrice();
       c2.setItem(i4);
       totalBill+=i4.getUnitPrice();
       c2.setItem(i5);
       totalBill+=i5.getUnitPrice();
       
       System.out.println(c2.getName() +": Total Bill:"+totalBill);
       
       */
       
       

	}

}
