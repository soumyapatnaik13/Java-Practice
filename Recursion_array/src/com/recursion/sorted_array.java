package com.recursion;

public class sorted_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,2,3,4,5};
		System.out.println(sorted(arr,0));

	}
	
   static boolean sorted(int [] arr, int index) {
	   if(index == arr.length-1) {
		   return true;
	   }
	   return index < index+1 && sorted(arr,index+1);
   }
}
