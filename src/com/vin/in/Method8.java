package com.vin.in;

public class Method8 {
	int sum;

	public static void main(String[] args) {
  Employee e1=new Employee();
  Method8 m8=new Method8();
  int result =m8.addtion(e1);
  System.out.println(result);
		
	}

	int addtion(Employee e) {
		
		sum=e.tel+e.eng+e.hin+e.maths;
		return sum;
	}
	
}
