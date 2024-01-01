package com.pattern;

public class Asterick_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int num =5;// represents at that line how many value printed
      pattern(num);
	}
	static void pattern (int num) {
		for(int row =1;row<=num;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
		for(int row= num-1; row>=1;row--) {
			for(int col=1;col<=row;col++) {
				System.out.print(" *");		
				}
			System.out.println();
		}
	 
	}
	
}

