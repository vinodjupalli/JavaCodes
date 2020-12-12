package com.vin.in;

public class Method4 {

	double div(int x,int y) {
		double z=x%y;
		return z;
		
	}
	public static void main(String[] args) {
   Method4 m4=new Method4();
  double result= m4.div(7, 3);
  
  System.out.println(result);
   
	}

}
