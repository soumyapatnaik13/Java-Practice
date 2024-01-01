package com.recursion;

public class index_in_linear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,3,4,6,7,8};
		int target=7;
		System.out.println(index(arr,target,0));
 
	}
	static int index(int [] arr,int target,int index) {
		if(index==arr.length) {
			return -1;
		}
		if(arr[index]==target) {
			return index;
		}
		else {
			return index(arr,target,index+1);
		}
	}

}
