package com.rahul;

import java.util.Arrays;

class CustomArrayList{
	private int [] arr;
	private static int defaultsize=10; // independent
	int size=0; //index
	//constructer
	CustomArrayList(){
	  arr=new int [defaultsize];
	}
	//add
	public void add(int num) {
		if (isfull()) {
			resize();
		}
		arr[size]=num;
		size++; // increasing
	}
	private boolean isfull() {
		return arr.length==size;
	}
	private void resize() {
		int [] temp= new int [size*2];
		for(int i=0;i<arr.length;i++) {
			temp[i]=arr[i];
		}
	   arr=temp;
	}
	private int remove() {
		int remove= arr[--size];
		
		return remove;
	}
	private int get(int index) {
		return arr[index];
	}
	private int set(int index,int value) {
		return arr[index]=value;
	}
	@Override // override the tostring method to print the array
	public String toString() {
		return Arrays.toString(arr);
	}
	
}


public class ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     CustomArrayList obj = new CustomArrayList();
     obj.add(4);
     obj.add(6);
     obj.add(3);
     
     System.out.println(obj);
	}

}
