package com.recursion;

public class binary_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {10,20,30,40,50,60,70,80};
		int target= 60;
		int ans=search(arr,target,0,arr.length-1);
		System.out.println(ans);
	}
	static int search(int [] arr, int target,int start,int end) {
		if(start>end) {
			return -1;
		}
		int mid = start + (end-start)/2;
		if(arr[mid]== target) {
			return mid;
		}
		if(arr[mid]>target) {
			return search(arr,target,start,mid-1);
		}
	
			return search(arr,target,mid+1,end);
	
	}
      
}
