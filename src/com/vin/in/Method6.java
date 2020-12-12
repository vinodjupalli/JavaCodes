package com.vin.in;

public class Method6 {
int sum;
	public static void main(String[] args) {

		int [] arr= {1,2,3,4,5,6,7};
		
		Method6 m6=new Method6();
		int result=   m6.display(arr);
		System.out.println(result);
	}
	
	int display(int[] arr1) {
		 // we will use for loop for print array
		
		for(int arr3:arr1) {

sum+=arr3;

		}
	return sum;
	}

}
