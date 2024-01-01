public class sum_of_digits {
    public static void main(String[] args) {
        int num =13402;
       int ans= sum(num);
        System.out.println(ans);
    }
    static int sum(int num){
        if(num == 0){
            return 0;
        }
        return (num %10 ) + sum (num/10);
    }

    
}
