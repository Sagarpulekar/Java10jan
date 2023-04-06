package com.multiple;

class Father
{
	float prop;
	
	Father()
	{
		prop=67000f;
	}
	
	void displayProp()
	{
		System.out.println("Assests:"+prop);
	}


}

class Mother 
{
   float prop;
   float jewels;
   
   Mother()
   {
	   prop=9000f;
	   jewels=7800f;
   }
   
   void displayProp()
   {
	   System.out.println("Assests:"+prop+jewels);
   }


}


public class Child extends Father,Mother{

	public static void main(String[] args) {

      Child c = new Child();
      c.displayProp();

	}

}
