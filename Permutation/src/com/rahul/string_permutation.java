package com.rahul;
import java.util.ArrayList;
public class string_permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String up= "abc";
     ArrayList<String>list=new ArrayList<>();
     func(up,"",list);
     for(String num:list) {
    	 System.out.println(num);
     }
     
	}
	static void func(String up,String p,ArrayList<String>list) {
		if(up.isEmpty()) {
			list.add(p);
			return;
		}
	for(int i=0;i<up.length();i++) {
		char c= up.charAt(i); //a
		String left=up.substring(0,i);
		String right= up.substring(i+1);
		String merge= left+right;
		func(merge,p+c,list);
		
	}
	}

}
