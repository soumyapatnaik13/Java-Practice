package com.recursion;

public class binary_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,4,5,6,7,9};
		int target= 6;
	   System.out.println(binary(arr,target,0));
		

	}
	static boolean binary(int[] arr,int target, int index) {
		if(arr[index]== arr.length) {
			return false;
		}
		return arr[index]== target || binary(arr,target,index+1);
	}

}
