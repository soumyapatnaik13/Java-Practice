package com.rahul;
import java.util.*;
public class HashMap_implementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Map<Integer,String> p= new HashMap<>();
       Scanner sc= new Scanner(System.in);
       System.out.println("enter the number of keys you want toinsert");
       int num=sc.nextInt();
       for(int i=1;i<=num;i++) {
    	   System.out.println("Enter the number: ");
    	   int a= sc.nextInt();
    	   
    	   System.out.println("enter the name :");
    	   String s= sc.next();
    	  p.put(a, s);
       }
	}

}
