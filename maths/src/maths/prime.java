package maths;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =12;
		System.out.println(isprime(num));

	}
	static boolean isprime(int n) {
		if(n<=1) {
			return false;
		}
		int count =2;// to check from 2 to square root of that number
		while(count* count <= n) { // count = square root of n sowe multiply both sides
			if(n % count ==0) {
				return false;
				
			}
			count++;
		}
		return true;
	}

}
