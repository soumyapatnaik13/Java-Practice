public class prime {
    public static void main(String [] args){
        int n =40; // size
        boolean [] primes = new boolean[n+1]; // n+1 is index
        sieve(primes,n);
    }
   // false in array means number is prime
    static void sieve(boolean[] primes, int n){
        for(int i=2; i*i<=n;i++){
            if(!primes[i]){
                for(int j=i*2;j<=n;j+=i){
                    primes[j]=true; // not prime
                }

            }
        }
        for(int i=2;i<=n;i++){
            if(!primes[i]){
                System.out.println(i);
            }
        }
    }
}
