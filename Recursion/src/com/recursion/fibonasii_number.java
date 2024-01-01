package com.recursion;
import java.util.Scanner;

public class fibonasii_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your number:");
		int  num = sc.nextInt();
       System.out.println(fibo(num));
	}
	static int fibo(int n) {
		if(n<2) {
			return n;
		}
		return fibo(n-1) + fibo (n-2);
	}
	

}
