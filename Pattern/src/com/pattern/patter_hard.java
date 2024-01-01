package com.pattern;

public class patter_hard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int n =4;
     pattern(n);
	}
	static void pattern(int n) {
		for(int i =1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) { // spaces
				System.out.println("");
			}
			for(int k=1;k<=i;k++) { // printing stars
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i =n-1;i>=1;i--) {
			for(int j=1;j<=n-i;j++) {
				System.out.print("");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
