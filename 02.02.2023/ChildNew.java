package com.demo;

import com.single.Parent;

public class ChildNew extends Parent {
	
	private int standard;
	
	public int getStandard() {
		return standard;
	}


	public void setStandard(int standard) {
		this.standard = standard;
	}


	public static void main(String[] args) {

       ChildNew c1= new ChildNew();
       c1.setMarks(89f);
       c1.setName("Pritish");
       

	}

}
