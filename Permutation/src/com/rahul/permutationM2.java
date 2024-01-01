package com.rahul;
import java.util.ArrayList;
import java.util.List;
public class permutationM2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {1,2,3};
		List<List<Integer>>ans= new ArrayList<>();
		int index=0;
		helper(arr,index,ans);
		List<Integer>li= new ArrayList<>();
	     for(int i=0;i<ans.size();i++) {
	    	li.addAll(ans.get(i));
	    	System.out.println(li);
	    	 }
	  }
		
	static void helper(int []arr, int index,List<List<Integer>>ans) {
		if(index==arr.length) {
			List<Integer>li= new ArrayList<>();
			for(int i=0;i<arr.length;i++) {
				li.add(arr[i]);
			}
				ans.add(li);
				return;
		
		}
		for(int i=index;i<arr.length;i++) {
			swap(arr,index,i);
			helper(arr,index+1,ans);
			swap(arr,index,i);
		}
	}
	static void swap(int []arr, int index,int i ) {
		int temp= arr[index];
		arr[index]=arr[i];
		arr[i]=temp;
	}

}
