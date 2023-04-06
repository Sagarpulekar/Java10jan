package com.example;

public class MethodDemo {
		
	static float calculateTotal(float s1, float s2, float s3) {
		
		float total,avg;
		//s1+=10;
		//System.out.println("Subject 1 in method:"+s1);
		total= s1+s2+s3;
		//System.out.println("Total:"+total);
		
		avg= (s1+s2+s3)/3;
		//return total,avg;
		return total;
	}
	
	static char calculateGrade(float tm)
	{
		if(tm>85)
			return 'A';
		else if(tm>65)
			 return 'B';
		else 
			return 'F';
	}

	public static void main(String[] args) {

       float sub1,sub2,sub3;
       sub1=90f;
       sub2=88.6f;
       sub3= 85f;

      // calculateTotal(sub1, sub2, sub3);
      // calculateTotal(88.6f, 77.5f, 78.6f);
      // System.out.println("Subject 1 in main:"+sub1);
       
      // System.out.println("Total is :"+calculateTotal(sub1, sub2, sub3));
       
       float totalMarks= calculateTotal(sub1, sub2, sub3);

       char grade= calculateGrade(totalMarks);
       totalMarks= totalMarks/3;
       System.out.println(totalMarks);
       System.out.println(totalMarks);
       
       System.out.println(grade);
	}

}
