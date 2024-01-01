package com.rahul;
import java.util.Scanner;

public class sorted_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the number of element: ");
    int n = sc.nextInt();
    
    int [] arr = new int [n];
    System.out.println("Enter your element: ");
    
    for(int i=0;i<arr.length;i++) {
    	arr[i]=sc.nextInt();
    	
    }
    
    //bubble sort
    
    for(int i=0;i<arr.length-1;i++) {
    	for(int j=0;j<arr.length-1-i;j++) {
    		if(arr[j]>arr[j+1]) {
    			int temp=arr[ j];
    			arr[j]= arr[j+1];
    			arr[j+1]=temp;
    		}
    	}
    }
    System.out.println("sorted arry");
    for(int num : arr) {
    	System.out.println(num);
    
    }
	}

}
