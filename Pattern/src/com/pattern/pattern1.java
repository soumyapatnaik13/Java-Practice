package com.pattern;

public class pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int n=4;
      pattern(n);
	}
	// rows
    static void pattern(int num) {
    	for (int row=1;row<=num;row++) {
    		for(int column =1;column<=row;column++) {
    			System.out.print("* ");
    		}
    		//when the row is printed we need to add a new line
    		System.out.println();
    		
    	}
    }
}
