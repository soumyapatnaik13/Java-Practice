package com.recursion;

public class pelindrome_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int num = 345;
      reverse(num);
      if(num == reverse(num)) {
    	  System.out.println("pelindrome");
      }
      else {
    	  System.out.println("not a pelindrome");
      }
	}
     static int reverse(int num) {
     int count =0;
     while(num>0) {
     int rem = num % 10;
     count = count * 10 + rem;
     num=num/10;
    
}
    return count;
     }
}
