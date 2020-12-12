package com.vin.in;

public class Method7 {

	public static void main(String[] args) {
         Student s2=new Student();
         Method7 m7=new Method7();
         m7.disply(s2);
         
	}
       void disply(Student s1) {
    	   System.out.println("Student name is:" +s1.name);
    	   System.out.println("Student age is:" +s1.age);
    	   System.out.println("Student height is:" +s1.height);
       }
}
