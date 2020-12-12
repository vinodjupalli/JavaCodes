package com.vin.in;

public class Display {
	int no;
	String name;
	String branch;

	public static void main(String[] args) {
        Display d1=new Display(407,"Vinod Jupalli","DT");
        
   
	}
	
	Display(int x,String y,String z){
		
		no=x;
		name=y;
		branch=z;
		
		System.out.println(no);
		
		
	}

}
