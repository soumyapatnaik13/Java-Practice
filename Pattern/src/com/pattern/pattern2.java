package com.pattern;

public class pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int n=5;
     pattern(n);
	}
     // number of elements - row
     static void pattern(int n) {
    	 for(int row=0;row<=n;row++) {
    		 for(int column =1; column<=n-row;column++) {
    			 System.out.print("* ");
    		 }
    		 System.out.println(" ");
        	 
    	 }
    	
     }
     
	}


