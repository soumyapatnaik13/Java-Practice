public class factorial{
    public static void main(String[] args) {
       int num =5;
       int ans=fact(num);
       System.out.println(ans); 
    }
    static int fact(int n){
        if(n==1){
            return 1;
        }
        return n* fact(n-1);
    }
}