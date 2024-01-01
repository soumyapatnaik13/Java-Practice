package com.pattern;

public class pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =5;
		pattern(num);

	}
	static void pattern(int num) {
		for(int row=1;row<=num;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print(col);
			}
			System.out.println(" ");
		}
	}
}


