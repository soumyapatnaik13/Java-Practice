package com.pattern;

public class number_sequence_analys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int n=5;
	pattern(n);

	}
	static void pattern(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			//for descending number
			for(int j=i;j>=1;j--) {
				System.out.print(j);
				
			}
			for(int j=2;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
