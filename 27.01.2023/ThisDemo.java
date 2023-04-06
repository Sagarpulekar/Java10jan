package com.example;

public class ThisDemo {
	
	int a;
	int b;
	String name;
	
	public ThisDemo(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	
	public ThisDemo()
	{
		this(90,67);
		name="Shuruti";
		
	}
	
	void display()
	{
		int a=900;
		System.out.println("Local a:"+a);
		System.out.println("Instance a:"+this.a);
		//this.addition(this);
	   addition(this);	
	}
	
	ThisDemo displayValues()
	{
		this.a+=10;
		this.b+=10;
		return this;
	}
	
	void addition(ThisDemo obj)
	{
		this.a= this.a +obj.a;
		this.b= this.b +obj.b;
	}
	/*
	void addition(ThisDemo obj)
	{
		obj.a= obj.a+obj.a;
	}*/
	
	
	public static void main(String[] args) {

      ThisDemo obj1= new ThisDemo(20,30);
      ThisDemo obj2= new ThisDemo();// 90 67
      
      System.out.println("Before :"+obj2.a + "   "+obj2.b);
      obj2.display();
      System.out.println("After:"+obj2.a + "   "+obj2.b);
      
     /* 
      System.out.println(obj1.a + "   "+obj1.b);
      
      obj1.addition(obj2);
      
      System.out.println(obj1.a + "   "+obj1.b);
      
    */
      
      ThisDemo obj3= obj2.displayValues(); 
      
          
      System.out.println("Object 3:"+obj3.a + "   "+obj3.b);
      System.out.println("Object 2:"+obj2.a + "   "+obj2.b);
	}

}
