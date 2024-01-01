import java.util.Scanner;
public class setbit {
    public static void main (String[] arg){
        Scanner s = new Scanner (System.in);
        int n =s.nextInt();
        int ans = findvalue(n);
        System.out.println(ans);
        s.close();

    
    }
    static int findvalue(int n){
        int mask =1;
        int pos =0;

        while((n & mask)==0){
            mask= mask << 1;
            pos++;
        }
        return pos;
    }
}
