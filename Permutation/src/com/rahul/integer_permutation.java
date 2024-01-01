package com.rahul;
import java.util.ArrayList;
import java.util.List;
public class integer_permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    List<List<Integer>> ans= new ArrayList<>();
    int [] nums= {1,2,3};
    List<Integer>ds= new ArrayList<>();
    boolean[] arr= new boolean[nums.length];
    
    helper(nums,ds,ans,arr);
    
    for(List<Integer>ar:ans) {
    	System.out.println(ar);
    }
	}
	static void helper(int []nums, List<Integer>ds,List<List<Integer>>ans,boolean []arr) {
		if(ds.size()==nums.length) {
			List<Integer>l= new ArrayList<>();
			for(int i=0;i<nums.length;i++) {
				l.add(ds.get(i));
			}
			ans.add(l);
			return;
		}
		for(int i=0;i<nums.length;i++) {
			if(arr[i]==false) {
				ds.add(nums[i]);
				arr[i]=true;
				helper(nums,ds,ans,arr);
				arr[i]=false;
				ds.remove(ds.size()-1);
			}
		}
	}

}
