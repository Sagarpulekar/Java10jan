package com.demo;

public class Person {
	private int Id;
	private String Name;
	private int Age;
	private Address adds;

	public Person() {

	}

	public Person(int Id, String Name, int Age, Address adds) {
		System.out.println("Constructor");
		this.Id = Id;
		this.Name = Name;
		this.Age = Age;
		this.adds = adds;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public Address getAdds() {
		return adds;
	}

	public void setAdds(Address adds) {
		this.adds = adds;
	}

	public String toString() {
		return "ID:" + Id + "Name:" + Name + "Age:" + Age + "Address" + adds;
	}
}
