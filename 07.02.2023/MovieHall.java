package com.movies;

public class MovieHall {

	public static void main(String[] args) {
		
	Movie m1= new Movie(1,"War","2023-01-23");	
	Movie m2= new Movie(2,"KFG","2022-12-25");

    Theatre t1= new Theatre(101,"PVR","Pune",m1);
    System.out.println(t1);
    
    t1.setMovie(m2);
    System.out.println(t1);
    
    Theatre t2= new Theatre(102,"Liberty","Delhi");
    System.out.println(t2);
    
    t2.setMovie(m2);
    System.out.println(t2);
    
    

	}

}
