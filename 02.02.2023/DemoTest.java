package com.single;

class One
{
	protected int data;
	
	public One() {
		
	}


	public One(int data) {
		this.data = data;
	}


	public int getData() {
		return data;
	}


	 void setData(int data) {
		this.data = data;
	}


	public String toString() {
		return "One [data=" + data + "]";
	}
	
	
}

class Two extends One
{
	private String name;
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public void display()
	{
	   System.out.println(name+data);	
	}
	
	public String getName()
	{
		return name;
	}

}


public class DemoTest {
	
	public static void main(String args[])
	{
		One o1= new One();
		o1.setData(34);
		o1.getData();
		
		Two t1= new Two();
		t1.setData(56);
		t1.setName("Choco");
		
		System.out.println(o1.getData());
		System.out.println(t1.getData()+t1.getName());
		
		
	}

}
