package com.recursion;

public class product_of_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int num = 505;
     fact(num);
     System.out.println(fact(num));
	}
	static int fact(int num) {
		if(num % 10 == num) {
			return num;
		}
		return (num%10)* fact(num/10);
	}

}
