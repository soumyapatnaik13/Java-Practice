package com.recursion;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5;
		fact(num);
		System.out.println(fact(num));

	}
   static int fact(int num) {
	   if(num == 1) {
		   return 1;
	   }
	   return num * fact(num-1);
		}

}

