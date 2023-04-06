package com.single;

public class Child extends Parent {
	
	private String school;
		
	public String getSchool() {
		return school;
	}


	public void setSchool(String school) {
		this.school = school;
	}

	public static void main(String[] args) {
		
		Child c1= new Child();
		
		// not access private
		c1.setName("Omkar"); // public
		c1.setMarks(89f); // protected
		c1.setAge(10); // default
		c1.setSchool("Laurel High");
		
		System.out.println(c1.getName()+" "+c1.getMarks()+c1.getAge()+c1.getSchool());
		

    

	}

}
