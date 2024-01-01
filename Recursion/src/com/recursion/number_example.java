package com.recursion;

public class number_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1;
       print(n);
	}
	//static void print(int n) {
		// System.out.println(n);
	//	print2(2);
	//}
	//static void print2(int n) {
	//	System.out.println(n);
	//	print3(3);
	// }
//	static void print3(int n) {
	//	System.out.println(n);
//	}
	
	static void print(int n) {
		if(n==5) {
			return;
		}
		System.out.println(n);
		print(n+1);
		//tale recursion
		//last things to execute
		
}
}