package maths;

public class sieve_of_eratoshnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =40;
		boolean [] prime = new boolean [n+1];
		seive(prime,n);

	}
  static void seive(boolean [] prime, int n) {
	  for(int i=2;i*i<=n;i++) {
		  if(prime[i] == false) {
			  for(int j = i*i;j<=n;j=j+i) {
				  prime[j]=true;
			  }
		  }
		  
	  }
	  for(int i=2;i<=n;i++) {
		  if(prime[i] == false) {
			  System.out.println(i);
		  }
	  }
  }
}
