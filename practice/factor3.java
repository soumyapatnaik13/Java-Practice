public class factor3 {
    public static void main(String[] args) {
    int n=20;
    fact(n);
}
static void fact(int n){
    for(int i=0;i<= Math.sqrt(n);i++){
        if(n % i ==0){
            if(n/i==i){
                System.out.println(i);
            }
            else{
            System.out.println(i+" "+n/i);
            }
        }

    }
}
}