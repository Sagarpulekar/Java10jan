package com.maplogical;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Student {

	private int id;
	private String name;
	private int age;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public int hashcode()
	{
		return Objects.hash(id,name,age);
	}

	public boolean equals(Object o)
	{
		if(this==o)
			return true;
		if(this.getClass()!=o.getClass())
			return false;
		Student s= (Student)o;
		if(this.id!=s.id)
			return false;
		else if(this.name==null)
			return false;
		else if(s.name==null)
			return false;
		else if(!this.name.equals(s.name))
			  return false;
		else if(this.age!=s.age)
			return false;
		
		return true;
	}
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	
}

public class SearrchKeyMap {
	
	
	public static void searchStudent(HashMap<Student, String> map)
	{
		String name="Sagar";
		Student s=null;
		String course=null;
		for(Map.Entry<Student, String> en:map.entrySet())
		{
			s= en.getKey();
			if(s.getName().equals(name))
			{
				course=en.getValue();
			}
			
		}
		
		if(course!=null)
		{
			System.out.println(name +" has applied for "+course);
		}
		else
		{
			System.out.println("No record found");
		}
		
	}

	public static void main(String[] args) {

     HashMap<Student,String> smap= new HashMap<>();
     
     smap.put(new Student(101,"Bhushan",23), "BCA");
     smap.put(new Student(102,"Vivek",22), "MBA");
     smap.put(new Student(103,"Uday",25), "MCA");
     
     searchStudent(smap);
     

	}

}
